package com.nttdata.bootcamp.productservice.services;

import org.springframework.cloud.client.circuitbreaker.ReactiveCircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.ReactiveCircuitBreakerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class ProductServiceRemote {
	
	private final WebClient webClient;
	private final ReactiveCircuitBreaker readingListCircuitBreaker;
		
	public ProductServiceRemote(ReactiveCircuitBreakerFactory circuitBreakerFactory) {
		this.webClient = WebClient.builder().baseUrl("http://localhost:8090").build();
		this.readingListCircuitBreaker = circuitBreakerFactory.create("recommended");
	}
		
	public Mono<String> readingList() {
			return readingListCircuitBreaker.run(webClient.get().uri("/recommended").retrieve().bodyToMono(String.class), throwable -> {
				System.out.println("Error making request to book service");
				return Mono.just("Cloud Native Java (O'Reilly)");
			});
	}

}
