package com.sufi.tech.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sufi.tech.entity.Product;
import com.sufi.tech.repository.ProductReepository;

@Service
public class ProductServiceImpl implements ProductServioce {
	
	ProductReepository reepository;
	public ProductServiceImpl(ProductReepository reepository) {
		super();
		this.reepository = reepository;
	}

	@Override   // insert Single Data
	public String insertProduct(Product product) {
		String insertProduct = reepository.insertProduct(product);
		return insertProduct;
	}

	@Override   // insert or create multiple data
	public String insertMultiplProduct(List<Product> products) {
		  String multiplProduct = reepository.insertMultiplProduct(products);
		 return multiplProduct;
		
	}

	@Override   // get product by id
	public Product getProductById(int id) {
		     Product productById = reepository.getProductById(id);
		return productById;
	}
	
	
	@Override   // getAllProduct/ fetch All data
	public List<Product> getProductAllList() {
	    return reepository.getProductAll();
	}


	@Override  // update product
	public String updateProduct(Product product) {
		String updateProduct = reepository.updateProduct(product);
		return updateProduct;
	}
	
	@Override  // delete by id
	public String deleteProductById(int id) {
		String productById = reepository.deleteProductById(id);
		return productById;
	}

	@Override   // delete All Product
	public String deletedAllProduct() {
		String allProduct = reepository.deleteAllProduct();
		return allProduct;
	}

}
