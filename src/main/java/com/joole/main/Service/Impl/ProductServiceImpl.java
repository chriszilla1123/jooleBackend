package com.joole.main.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joole.main.DAO.ProductDAO;
import com.joole.main.Entity.Product;
import com.joole.main.Service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDAO productDao;

	@Override
	public List<Product> getProducts() {
		return productDao.findAll();
	}
}
