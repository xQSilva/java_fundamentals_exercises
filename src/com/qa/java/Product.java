package com.qa.java;

public class Product {
	int id;
	String name;
	double price;
	String category;
	float rating;
	float discountPercentage;
	boolean isAvaliable;
	static String SELLER_NAME = "QA";
	static String SELLER_CONTACT_NUMBER = "12345678910";
	static String SELLER_EMAIL = "hello@gmail.com";

	public Product(int id, String name, double price, String category, float rating, float discountPercentage,
			boolean isAvaliable) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.rating = rating;
		this.discountPercentage = discountPercentage;
		this.isAvaliable = isAvaliable;

	}

	void productInfo() {
		System.out.println("id:   " + id);
		System.out.println("name:  " + name);
		System.out.println("price:  " + price);
		System.out.println("category:  " + category);
		System.out.println("rating:  " + rating);
		System.out.println("discountPercentage:  " + discountPercentage);
		System.out.println("isAvaliable:  " + isAvaliable);
		System.out.println();

	}

	double productDiscountPrice() {
		return (price * discountPercentage / 100);
	}
	static void SELLER_CONTACT_DETAILS() {
		System.out.println("seller name" + SELLER_NAME);
		System.out.println("seller name" + SELLER_NAME);
		System.out.println("seller name" + SELLER_NAME);
		
	}
}
