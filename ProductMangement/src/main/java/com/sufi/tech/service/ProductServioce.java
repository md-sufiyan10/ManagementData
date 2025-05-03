package com.sufi.tech.service;

import java.util.List;

import com.sufi.tech.entity.Product;

public interface ProductServioce {
	
	public String insertProduct(Product product);
	public String insertMultiplProduct(List<Product> products);
	
	 public Product getProductById(int id);
	 List<Product> getProductAllList();
	 
	 public String updateProduct(Product product);
	 
	public String deleteProductById(int id);
	public String deletedAllProduct();
	
	

}
