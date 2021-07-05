package com.company.sak;

import com.company.sak.entity.Ball;
import com.company.sak.entity.Basket;
import com.company.sak.entity.Color;
import com.company.sak.exception.MaxWeightException;
import com.company.sak.exception.NullException;
import com.company.sak.service.BasketService;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        try {
            basket.addBallInBasket(new Ball(12.1, Color.RED));
            basket.addBallInBasket(new Ball(10.1, Color.BLUE));
            basket.addBallInBasket(new Ball(20000.3, Color.BLUE));
            basket.addBallInBasket(new Ball(-19, Color.BLUE));
            basket.addBallInBasket(new Ball(10.1, Color.YELLOW));
            basket.addBallInBasket(new Ball(10.1, Color.BLUE));
        } catch (NullException | MaxWeightException e) {
            e.printStackTrace();
        }

        System.out.println(basket);
    }
}
