package com.spring_practise.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring_practise.demo.Models.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{}
