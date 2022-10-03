package com.nttdata.bootcamp.productservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.productservice.dto.ProductDto;
import com.nttdata.bootcamp.productservice.services.ProductServiceI;

@RestController
@RequestMapping("/producto")
public class ProductController {
	
	@Autowired
	ProductServiceI productoServicio;
	
	@GetMapping(value="/{id}")
	public ProductDto getProducto(@PathVariable Integer id) {
		System.out.println(id);
		return productoServicio.getProducto(id);
	}
	
	@PostMapping(value="/{id}")
	public ProductDto postProduct(@PathVariable Integer id) {
		return productoServicio.postProduct(id);
	}

}
