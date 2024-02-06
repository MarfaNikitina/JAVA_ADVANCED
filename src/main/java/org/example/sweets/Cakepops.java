package org.example.sweets;

public class Cakepops extends Candy {
    private String color;

    public Cakepops(String name, double weight, double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cakepops [" + super.toString() + ", color: " + color + "];";
    }
}
