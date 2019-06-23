//package com.sgic.internal.product.controller;
//
//import static org.junit.Assert.assertEquals;
//
//import java.io.IOException;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.web.client.RestClientException;
//
//import com.sgic.internal.product.ProductTest;
//import com.sgic.internal.product.controller.dto.ProductData;
//
//public class PostProduct extends ProductTest{
//	
//	@Autowired
//	JdbcTemplate jdbcTemplate;
//	
//	private ProductData productData = new ProductData();
//	
//	@SuppressWarnings("unused")
//	public void testCreateProduct() throws IOException, RestClientException{
//		productData.setProductLicenseName("Vertusa");
//		productData.setProductAbbr("VER");
//		productData.setProductLicenseName("Brownse");
//		productData.setProdutLicensePeriod("18 months");
//		productData.setProductStartDate("23.05.2019");
//		productData.setProductEndDate("22.05.2020");
//		productData.setProdutItAdminName("Mathan");
//		productData.setProductDescribtion("All Prievillages have");
//		
//		HttpHeaders httpHeaders = new HttpHeaders();
//		HttpEntity<ProductData> request = new HttpEntity<ProductData>(productData , httpHeaders);
//		ResponseEntity<String> postResponse = testRestTemplate.postForEntity("http://localhost:8083/product"+ "/createProduct", request ,String.class);
//		assertEquals(200, postResponse.getStatusCode());
//		
//		ResponseEntity<String> getResponse = testRestTemplate.exchange("http://localhost:8083/product"+"/getAllProduct", HttpMethod.GET , new HttpEntity<>(httpHeaders), String.class);
//		assertEquals(HttpStatus.OK , getResponse.getStatusCode());
//		
//		object body = ""
//	}
//
//}
