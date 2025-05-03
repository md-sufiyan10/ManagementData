package com.sufi.tech.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.sufi.tech.entity.Product;

@Repository
public class ProductReepository {

	SessionFactory sf;

	public ProductReepository(SessionFactory sf) {
		super();
		this.sf = sf;
	}
	
	// insert data single
	public String insertProduct(Product product) {
		    Session session = sf.openSession();
		         Transaction tr = session.beginTransaction();
		         session.save(product);
		         tr.commit();
		         session.close();
		  return "Product Single Data Inserted Successfully..";
		
	}
	
	// insert data multiple
	public String insertMultiplProduct(List<Product> products){
		         Session session = sf.openSession();
		           Transaction tr = session.beginTransaction();
		           for(Product p : products) {
		        	   session.save(p);
		           }
		           tr.commit();
		           session.close();
		return "Multiple Producrt Data Inserted Successfully..";
		
	}
	
	public Product getProductById(int id) {
		        Session session = sf.openSession();
		           Product product = session.get(Product.class, id);
		           return product;
		
	}
	public List<Product> getProductAll() {
		            Session session = sf.openSession();
		          
		            // HQL query to fetch all products
		           
		            List<Product> productList= session.createQuery("from Product", Product.class).list();
		            session.close();
		            return productList;
		           
	           }
	
	
	// update Product
	
		public String updateProduct(Product product) {
			Session  session=sf.openSession();
			Transaction tr = session.beginTransaction();
			session.update(product);
			tr.commit();
			session.close();
			return "Product Data Details Updated Successfully";
		}
	

	// delete by id
	public String deleteProductById(int id) {
		     Session session = sf.openSession();
		     Transaction tr = session.beginTransaction();
		     
		     Product product = session.get(Product.class, id);
		          session.delete(product);
		          tr.commit();
		     session.close();
		return "Product Data Deletd Successfully Id :"+id;
		
	}
	
	public String deleteAllProduct() {
		   Session session = sf.openSession();
		   Transaction tr = session.beginTransaction();
		// HQL to delete all products
		      String hql="DELETE FROM Product";
		      Query query= session.createQuery(hql);
		      int deleteCount = query.executeUpdate();
		      tr.commit(); 
		      session.close();
		return "All Product Data Deleted Successfully. Total Deleted: " + deleteCount;
		
	}
	
}
