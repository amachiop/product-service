package com.nttdata.bootcamp.productservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
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
	@Autowired
	Environment enviroment;

	@GetMapping(value="/{id}")
	public ProductDto getProducto(@PathVariable Integer id) {
		ProductDto producto = productoServicio.getProducto(id);
		producto.setServerPort(enviroment.getProperty("local.server.port"));
		return producto;
	}
	
	@PostMapping(value="/{id}")
	public ProductDto postProduct(@PathVariable Integer id) {
		return productoServicio.postProduct(id);
	}

}
