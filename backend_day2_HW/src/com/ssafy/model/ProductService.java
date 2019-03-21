package com.ssafy.model;

public class ProductService {
	private static ProductService productService = new ProductService();
	private static int ProductNum=0;
	public static ProductService getInstance() {
		return productService ;
	}
	private ProductService() {}
	public Product addProduct(Product p) {
		++ProductNum;
		p.setNum(Integer.toString(ProductNum));
		return p;
	}
}
