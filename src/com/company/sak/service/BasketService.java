package com.company.sak.service;

import com.company.sak.entity.Ball;
import com.company.sak.entity.Basket;
import com.company.sak.entity.Color;
import com.company.sak.exception.NullException;

import java.util.Iterator;


public class BasketService {

    public double currentWeightBasket(Basket basket) throws NullException {
        if (basket == null){
            throw new NullException();
        }
        double weightBallsInBasket = 0.0;
        Iterator<Ball> ballIterator = basket.getBallIterator();
        while (ballIterator.hasNext()){
            Ball ball = ballIterator.next();
            weightBallsInBasket += ball.getWeight();
        }
        return weightBallsInBasket;
    }

    public int calculateBlueBall(Basket basket) throws NullException{
        if (basket == null){
            throw new NullException();
        }
        int count = 0;
        Iterator<Ball> ballIterator = basket.getBallIterator();
        while (ballIterator.hasNext()){
            Ball ball = ballIterator.next();
            if (ball.getColor() == Color.BLUE) {
                count++;
            }
        }
        return count;
    }
}
