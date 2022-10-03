package com.nttdata.bootcamp.productservice.dto;

import org.springframework.beans.factory.annotation.Value;;


public class ProductDto {
	
	private Integer productId;
	private String channel;
	@Value("${local.server.port}")
	private String serverPort;
	
	public ProductDto(Integer productId, String channel) {
		this.productId=productId;
		this.channel=channel;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
	
	public String getServerPort() {
		return serverPort;
	}
	
	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}

}
