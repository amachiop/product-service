package com.nttdata.bootcamp.productservice.dto;

public class ProductDto {
	
	private Integer productId;
	private String channel;
	
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
	
	

}
