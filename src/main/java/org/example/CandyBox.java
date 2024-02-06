package org.example;
import org.example.sweets.Cakepops;
import org.example.sweets.Candy;
import org.example.sweets.Cupcake;
import org.example.sweets.Marshmellow;

public class CandyBox {
    public static void main(String[] args) {
        Cupcake firstCupcake = new Cupcake("Сливочный", 40, 200, "ванильный");
        Cakepops firstCakepops = new Cakepops("SweetBall", 32.5, 150, "red");
        Cakepops secondCakepops = new Cakepops("FunJoe", 35.7, 160, "green");
        Marshmellow march1 = new Marshmellow("Cloud", 10.5, 37, "blueberry");
        Marshmellow march2 = new Marshmellow("Kiss", 11, 40.5, "strawberry");
        Candy [] box = {firstCupcake, firstCakepops, secondCakepops, march1, march2};
        double fullPrice = 0;
        double fullWeight = 0;
        for (Candy sweet: box) {
            fullPrice += sweet.price;
            fullWeight += sweet.weight;
            System.out.println(sweet.toString());
        }
        System.out.println("Общий вес подарка: " + fullWeight);
        System.out.println("Общая стоимость подарка: " + fullPrice);

    }
}
