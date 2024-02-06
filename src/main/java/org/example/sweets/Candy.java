package org.example.sweets;

public abstract class Candy {
    public double price;
    public double weight;
    private String name;

    public Candy(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "name: " + name + ", price (rub): " + price + ", weight (g): " + weight;
    }
}
