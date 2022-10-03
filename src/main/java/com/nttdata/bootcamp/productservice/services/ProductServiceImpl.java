package com.nttdata.bootcamp.productservice.services;

import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.productservice.dto.ProductDto;

@Service
public class ProductServiceImpl implements ProductServiceI {

	@Override
	public ProductDto getProducto(Integer id) {
		return new ProductDto(id, "GET");
	}

	@Override
	public ProductDto postProduct(Integer id) {
		return new ProductDto(id, "POST");
	}

}
