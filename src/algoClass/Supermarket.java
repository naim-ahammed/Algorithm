package algoClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class ShoppingCart {
    private Map<Product, Integer> cartItems;

    public ShoppingCart() {
        cartItems = new HashMap<>();
    }

    public void addItem(Product product, int quantity) {
        cartItems.put(product, cartItems.getOrDefault(product, 0) + quantity);
    }

    public void removeItem(Product product, int quantity) {
        int currentQuantity = cartItems.getOrDefault(product, 0);
        int newQuantity = Math.max(0, currentQuantity - quantity);
        if (newQuantity == 0) {
            cartItems.remove(product);
        } else {
            cartItems.put(product, newQuantity);
        }
    }

    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(product.getName() + " - Quantity: " + quantity);
        }
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            total += product.getPrice() * quantity;
        }
        return total;
    }
}

public class Supermarket {
    public static void main(String[] args) {
        // Sample products
        Product apple = new Product("Apple", 1.0, 100);
        Product milk = new Product("Milk", 2.0, 50);

        // Sample shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Adding items to the cart
        cart.addItem(apple, 3);
        cart.addItem(milk, 2);

        // Displaying the cart
        cart.displayCart();

        // Calculating and displaying the total
        double total = cart.calculateTotal();
        System.out.println("Total: $" + total);
    }
}