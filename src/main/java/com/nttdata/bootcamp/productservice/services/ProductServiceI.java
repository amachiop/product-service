package com.nttdata.bootcamp.productservice.services;

import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.productservice.dto.ProductDto;

public interface ProductServiceI {
	
	public ProductDto getProducto(Integer id);
	
	public ProductDto postProduct(Integer id);

}
