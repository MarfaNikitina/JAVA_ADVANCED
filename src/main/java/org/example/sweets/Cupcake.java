package org.example.sweets;

public class Cupcake extends Candy {
    private String creamType;

    public Cupcake(String name, double weight, double price, String creamType) {
        super(name, weight, price);
        this.creamType = creamType;
    }

    @Override
    public String toString() {
        return "Cupcake [" + super.toString() + ", creamType: " + creamType + "];";
    }
}
