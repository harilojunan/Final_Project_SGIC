package com.sgic.internal.product.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.internal.product.entities.Product;

public interface ProductRepository extends JpaRepository<Product , Long> {

	Product findProductByProductRegiId(Long productRegiId);
}
