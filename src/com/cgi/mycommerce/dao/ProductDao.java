package com.cgi.mycommerce.dao;

import java.util.List;

import com.cgi.mycommerce.entity.Product;

public interface ProductDao {

	void createProduct(Product product);

	Product findProductById(Long id);

	void updateProduct(Product product);

	void removeProduct(Long id);

	List<Product> findAllProducts();

}
