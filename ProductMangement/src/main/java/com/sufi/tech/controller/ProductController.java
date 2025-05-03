package com.sufi.tech.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sufi.tech.entity.Product;
import com.sufi.tech.service.ProductServioce;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	ProductServioce service;
	public ProductController(ProductServioce service) {
		super();
		this.service = service;
	}

	@PostMapping("/insert")
	public String insertProduct(@RequestBody Product product) {
		   String insertProduct = service.insertProduct(product);
		return insertProduct;
	}
  
	@PostMapping("/multiple")
	public String insertMultipleProduct( @RequestBody List<Product> products) {
		     String multiplProduct = service.insertMultiplProduct(products);
		return multiplProduct;
		
	}
	
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable int id) {
		   Product productById = service.getProductById(id);
		return productById;
		
	}
	
	@GetMapping("/getAllData")
	public List<Product> getAllProduct(){
		List<Product> productList = service.getProductAllList();
		return productList;
		
	}
	
	@PutMapping("/update")
	public String updateProduct(@RequestBody Product product) {
		    String updateProduct = service.updateProduct(product);
		return updateProduct;
		
	}
	
	@DeleteMapping("/{id}")
	public String deleteProductById(@PathVariable  int id) {
		String productById = service.deleteProductById(id);
		return productById;
	}
	
	@DeleteMapping("/allDelete")
	public String deleteAllProduct() {
		   String allProduct = service.deletedAllProduct();
		return allProduct;
		
	}
}
