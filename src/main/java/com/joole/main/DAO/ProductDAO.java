package com.joole.main.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joole.main.Entity.Product;

@Repository
public interface ProductDAO extends JpaRepository<Product, Integer> {
	
	public List<Product> findAll();
}
