package com.company;

import com.company.entity.Ball;
import com.company.entity.Color;
import com.company.entity.Basket;

public class Main {

    public static void main(String[] args) {

        Basket basket = new Basket();
        basket.addBallInBasket(new Ball(12.1, Color.RED));
        basket.addBallInBasket(new Ball(10.1, Color.BLUE));
        basket.addBallInBasket(new Ball(19, Color.BLUE));
        System.out.println("Кол-во синих мячиков " + basket.pickBlueBall(Color.BLUE) + ", вес всех мячей: " + basket.getWeightBasket());

    }
}
