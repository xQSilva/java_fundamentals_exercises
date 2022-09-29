package com.qa.java;

public class Main {

	public static void main(String[] args) {
Product product1 = new Product(111,"tv",750.50,"televisions",4.5f,10.0f,true); 
product1.productInfo();

Product product2 = new Product(222,"mobile",950.50,"mobiles",4.8f,11.0f,false);
product2.productInfo();


System.out.println(product1.name + "'discount price is : " + product1.productDiscountPrice());
	}

}
