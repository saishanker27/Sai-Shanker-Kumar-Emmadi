package ObjectArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Product  implements Comparable <Product> {
    private int weight;
    private double price;
    private double id;

    public Product(int weight, double price, double id) {
        this.weight = weight;
        this.price = price;
        this.id = id;
    }
    public Product(){

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public double getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Product o) {
        if(this.price > o.price ) return 1;
        else if(this.price < o.price) return -1;
        return 0;
    }
    @Override
    public String toString() {
        return "Product{id=" + id + ", weight=" + weight + ", price=" + price + '}';
    }
    public static void main(String[] args) {
        // Creating a list of products for testing
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, 0.5, 10.99));
        productList.add(new Product(2, 0.8, 8.99));
        productList.add(new Product(3, 0.3, 15.99));

        // Sorting the products based on price using Comparable
        Collections.sort(productList);

        // Displaying the sorted products
        System.out.println("Sorted Products based on Price:");
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}