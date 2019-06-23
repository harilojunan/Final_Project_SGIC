package com.sgic.internal.product.controller.dto.converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.sgic.internal.product.controller.dto.ProductData;
import com.sgic.internal.product.entities.Product;

@Service
public class ProductConverter {
	
	private static Logger logger = LogManager.getLogger(ProductData.class);
	
	// Convert All List Product's Entity to DTO
	public static List<ProductData> ProductEntityListTOProductDataList(List<Product> productList) {
		
		if(productList != null) {
			
			logger.info("product converter -> conert List of Entity to DTO ");
			
			List<ProductData> listProductData = new ArrayList<>();
			
			for(Product product : productList) {
				
				ProductData productData = new ProductData();
				
				productData.setProductRegiId(product.getProductRegiId());
				productData.setProductCompName(product.getProductCompName());
				productData.setProductAbbr(product.getProductAbbr());
				productData.setProductLicenseName(product.getProductLicenseName());
				productData.setProdutLicensePeriod(product.getProdutLicensePeriod());
				productData.setProductDescribtion(product.getProductDescribtion());
				productData.setProductStartDate(product.getProductStartDate());
				productData.setProductEndDate(product.getProductEndDate());
				productData.setProdutItAdminName(product.getProdutItAdminName());
				
				listProductData.add(productData);
				
			}
			
			return listProductData;
		}
		
		return null;	
	}

	//convert productData to productEntity
	public static Product ProductDataTOProductEntity (ProductData productData) {
		
		Product product = new Product();
		
		if(productData != null) {
			
			logger.info("product converter -> convert object DTO to Entity");
			
			product.setProductRegiId(productData.getProductRegiId());
			product.setProductCompName(productData.getProductCompName());
			product.setProductAbbr(productData.getProductAbbr());
			product.setProductLicenseName(productData.getProductLicenseName());
			product.setProductDescribtion(productData.getProductDescribtion());
			product.setProdutLicensePeriod(productData.getProdutLicensePeriod());
			product.setProductStartDate(productData.getProductStartDate());
			product.setProductEndDate(productData.getProductEndDate());
			product.setProdutItAdminName(productData.getProdutItAdminName());
			
			return product;
		}
		
		return null;	
	}
	
	//convert productEntity to productData
	public static ProductData productEntityTOProductData (Product product) {
		
		ProductData productData = new ProductData();
		
		if(product != null) {
			
			logger.info("product converter -> conevert object Entity to DTO ");
			
			productData.setProductRegiId(product.getProductRegiId());
			productData.setProductCompName(product.getProductCompName());
			productData.setProductAbbr(product.getProductAbbr());
			productData.setProductLicenseName(product.getProductLicenseName());
			productData.setProductDescribtion(product.getProductDescribtion());
			productData.setProdutLicensePeriod(product.getProdutLicensePeriod());
			productData.setProductStartDate(product.getProductStartDate());
			productData.setProductEndDate(product.getProductEndDate());
			productData.setProdutItAdminName(product.getProdutItAdminName());
			
			return productData;
		}
			
		return null;	
	}

}
