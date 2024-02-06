package org.example.sweets;

public abstract class Candy {
    private double price;
    private double weight;
    private String name;

    public Candy(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "name: " + name + ", price (rub): " + price + ", weight (g): " + weight;
    }
}
