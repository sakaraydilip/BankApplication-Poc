package com.xoriant.assignment2;

public class Product
{

	private int productId;
	private String productName;
	private double price;
	private int rating;
	public Product(int productId, String productName, double price, int rating) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.rating = rating;
	}
	public Product() {
		super();
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", rating="
				+ rating + "]";
	}
	
	
}
