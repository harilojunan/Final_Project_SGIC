package com.sgic.internal.product.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.internal.product.controller.dto.ProductData;
import com.sgic.internal.product.controller.dto.mapper.ProductMapper;
import com.sgic.internal.product.entities.Product;


@RestController
public class ProductController {
	
	@Autowired
	private ProductMapper productMapper;
	
	private static Logger logger =LogManager.getLogger(ProductMapper.class);

	@PostMapping("/Product")
	public ResponseEntity<Product> saveProduct(@Valid @RequestBody ProductData productData){
		if(productMapper.saveProduct(productData) != null) {
			logger.info("Product Controller -> product create successfull");
			return new ResponseEntity<Product>(HttpStatus.CREATED);
		}
		logger.info("Product Controller -> product creation failed");
		return new ResponseEntity<Product>(HttpStatus.BAD_REQUEST);		
	}
	
	
	@PutMapping("/Product/{productRegiId}")
	public ResponseEntity<Product> updateProduct(@Valid @RequestBody ProductData productData){
		if(productMapper.updateProduct(productData) != null) {
			logger.info("Product Controller -> product update successfull");
			return new ResponseEntity<Product>(HttpStatus.OK);
		}
		logger.info("Product Controller -> product update failed");
		return new ResponseEntity<Product>(HttpStatus.BAD_REQUEST);	
	}
	
	
	@DeleteMapping("/Product/{productRegiId}")
	public ResponseEntity<Product> deleteProduct(@PathVariable(value = "productRegiId") Long productRegiId){
		System.out.println(productRegiId);
		if(productMapper.getProductById(productRegiId) != null) {
			if(productMapper.deleteProduct(productRegiId) != null) {
				logger.info("Product Controller -> product deleted successfull");
				return new ResponseEntity<Product>(HttpStatus.NO_CONTENT);
			}
		}else {
			logger.info("Product Controller -> product id not found!!!");
			return new ResponseEntity<Product>(HttpStatus.BAD_REQUEST);
		}
		logger.info("Product Controller -> product deleted fail!!!");
		return new ResponseEntity<Product>(HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/Products")
	public List<ProductData> getAllProduct(){
		logger.info("Product Controller -> List all product successfull");
		return productMapper.getAllProduct();	
	}
	
	@GetMapping("/Product/{productRegiId}")
	public ProductData getProductById(@PathVariable (value = "productRegiId")Long productRegiId) {
		logger.info("Product Controller -> get product by id successfull");
		return productMapper.getProductById(productRegiId);
		
	}
	
	
	
	
	
	

}
