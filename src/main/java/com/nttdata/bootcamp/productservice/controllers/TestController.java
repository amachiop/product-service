package com.nttdata.bootcamp.productservice.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Value("${product.product-name}")
	private String productName;
	
	@GetMapping(path="/product")
	public String productName() {
		return this.productName;
	}
	
}
