package org.example.sweets;

public class Marshmellow extends Candy {
    private String fruiteTaste;

    public Marshmellow(String name, double weight, double price, String fruiteTaste) {
        super(name, weight, price);
        this.fruiteTaste = fruiteTaste;
    }

    @Override
    public String toString() {
        return "Marshmellow [" + super.toString() + ", fruiteTaste: " + fruiteTaste + "];";
    }
}
