package com.spring_practise.demo.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_practise.demo.Models.Product;
import com.spring_practise.demo.Repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo repo;
	
	public List<Product> getProducts(){
		return repo.findAll();
	}
	
	public Product getProduct(int prodId) {
		Product product = repo.findById(prodId).orElse(null);
		return product;
	}
	
	public void addProduct(Product product) {
		repo.save(product);
	}
	
	public void updateProduct(Product product) {
		repo.save(product);
	}
	
	public void deleteProduct(int prodId) {
		repo.deleteById(prodId);
	}
	
}
