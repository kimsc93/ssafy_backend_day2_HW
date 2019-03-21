package com.ssafy.model;

public class Product{
	
	private String name;
	private String price;
	private String content;
	private String num;
	public Product(String name, String price, String content) {
		super();
		this.name = name;
		this.price = price;
		this.content = content;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
}
