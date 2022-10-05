package com.nttdata.bootcamp.productservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.nttdata.bootcamp.productservice.services.ProductServiceRemote;

import reactor.core.publisher.Mono;

@RestController
public class ControllerCircuitBreaker {
	
	@Autowired
	ProductServiceRemote productService;
	
	@RequestMapping("/circuit")
	public Mono<String> toRead(){
		return productService.readingList();
	}

}
