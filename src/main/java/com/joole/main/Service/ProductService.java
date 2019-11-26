package com.joole.main.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.joole.main.Entity.Product;
import com.joole.main.Entity.User;
@Service
public interface ProductService {
    List<Product> getProducts();
}
