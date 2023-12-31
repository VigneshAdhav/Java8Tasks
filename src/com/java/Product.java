package com.java;

import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;
    private String category;
    private String grade;

    public Product(String name, double price, String category, String grade) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getGrade() {
        return grade;
    }
}

 class Main {
    public static void main(String[] args) {
        // Sample list of products
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product1", 1200, "Electronics", "A+"));
        products.add(new Product("Product2", 800, "Clothing", "B"));
        products.add(new Product("Product3", 1500, "Electronics", "A"));
        products.add(new Product("Product4", 900, "Home Decor", "C"));
        products.add(new Product("Product5", 1100, "Electronics", "B+"));

        // Price threshold for filtering
        double priceThreshold = 1000;

        // Use Java streams to filter products with price > 1000
        List<Product> filteredProducts = products.stream()
                .filter(product -> product.getPrice() > priceThreshold)
                .toList();

        // Display the filtered products
        for (Product product : filteredProducts) {
            System.out.println("Name: " + product.getName() +
                               ", Price: " + product.getPrice() +
                               ", Category: " + product.getCategory() +
                               ", Grade: " + product.getGrade());
        }
    }
}
