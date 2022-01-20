package com.xoriant.assignment2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMain 
{

	public static void main(String[] args)
	{
		Product product1= new Product(101, "tv", 10000, 4);
		Product product2= new Product(201, "laptop", 30000, 3);
		Product product3= new Product(301, "mobile", 15000, 4);
		Product product4= new Product(401, "bike",90000, 5);
		Product product5= new Product(501, "fridge", 18000, 2);
		Product product6= new Product(601, "book", 8000, 5);
		Product product7= new Product(701, "fan", 3500, 4);
		
		
		List<Product> list= new ArrayList<Product>();
		list.add(product1);
		list.add(product2);list.add(product3);list.add(product4);list.add(product5);list.add(product6);list.add(product7);
		
		//Find the total price of all products
		System.out.println("---------------------------------------------------------------------");
		DoubleSummaryStatistics b=list.stream().collect(Collectors.summarizingDouble(Product::getPrice));
		System.out.println("Total Product Price : "+b.getSum());
		
		//Find the average price of all products
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Total average of all products : "+b.getAverage());
		
		//Total price of all products whose ratings above 4
		System.out.println("---------------------------------------------------------------------");
		DoubleSummaryStatistics b1=list.stream().filter(e->e.getRating()>4).collect(Collectors.summarizingDouble(Product::getPrice));
		System.out.println("Total Price of above 4 ratings : "+b1.getSum());
		
		//limit number of products to 5 if count is more than 5
		System.out.println("---------------------------------------------------------------------");
		Stream<Product>  l1=list.stream().limit(5);
		List<Product> l2=l1.collect(Collectors.toList());
		for (Product product : l2) {
			System.out.println(product);
		}
		        
		//double  l1=list.stream().map(Product::getProductName).collect(joining(","));
		
		//System.out.println(l1);
		//List<Product> l2=l1.collect(Collectors.toList());
//		for (Product product : l1) {
//			System.out.println(product);
//		}
		
	}
}
