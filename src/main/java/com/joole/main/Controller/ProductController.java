package com.joole.main.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.json.*;

import com.joole.main.Config.JwtTokenUtil;
import com.joole.main.Entity.Product;
import com.joole.main.Model.JwtRequest;
import com.joole.main.Service.JwtUserDetailsService;
import com.joole.main.Service.ProductService;

@RestController
@RequestMapping("product")
@CrossOrigin(origins = "*")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("getProducts")
	public List<Product> getProducts(){
		return productService.getProducts();
	}
}
