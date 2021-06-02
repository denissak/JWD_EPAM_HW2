package by.epam.sak.homework2;

import by.epam.sak.homework2.entity.Ball;
import by.epam.sak.homework2.entity.Basket;
import by.epam.sak.homework2.entity.Color;

public class Main {

    public static void main(String[] args) {

        Basket basket = new Basket();
        basket.addBallInBasket(new Ball(12.1, Color.RED));
        basket.addBallInBasket(new Ball(10.1, Color.BLUE));
        basket.addBallInBasket(new Ball(10.3, Color.BLUE));
        basket.addBallInBasket(new Ball(-19, Color.BLUE));
        basket.addBallInBasket(new Ball(10.1, Color.YELLOW));
        System.out.println(basket);
    }
}
