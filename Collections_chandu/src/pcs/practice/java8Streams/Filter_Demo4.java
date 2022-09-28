package pcs.practice.java8Streams;

import java.util.ArrayList;
import java.util.List;

class Product {
	int id;
	String name;
	double price;

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class Filter_Demo4 {
	public static void main(String[] args) {
		List<Product> pList = new ArrayList<Product>();

		pList.add(new Product(01, "books", 20.50));
		pList.add(new Product(02, "dell", 200000.500));
		pList.add(new Product(03, "hp", 30000));
		pList.add(new Product(04, "mobiles", 20000));
		pList.add(new Product(05, "lenovo", 10000));
		pList.add(new Product(06, "pens", 10.50));

		pList.stream().filter(p -> p.price > 25000) // filtering
				.forEach(pr -> System.out.println(pr.price)); // iterating

	}
}
