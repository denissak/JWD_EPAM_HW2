package com.company.sak.entity;

import com.company.sak.exception.MaxWeightException;
import com.company.sak.exception.NullException;
import com.company.sak.service.BasketService;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Basket implements Serializable {
    private List<Ball> balls;
    private final double maxWeightBasket = 20_000.00;
    private BasketService basketService = new BasketService();

    public Basket() {
        balls = new ArrayList<>();
    }

    public double getMaxWeigtbasket() {
        return maxWeightBasket;
    }

    public boolean addBallInBasket(Ball ball) throws NullException, MaxWeightException {
        if(ball == null){
            throw new NullException();
        }
        if (basketService.currentWeightBasket(this) + ball.getWeight() < maxWeightBasket) {
            balls.add(ball);
        }
        return true;

    }

    public Iterator<Ball> getBallIterator(){
        return balls.iterator();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Вес всех мячей ");
        try {
            sb.append(basketService.currentWeightBasket(this));
        } catch (NullException e) {
            e.printStackTrace();
        }
        sb.append(" Кол-во синих мячей ");
        try {
            sb.append(basketService.calculateBlueBall(this));
        } catch (NullException e) {
            e.printStackTrace();
        }
        return sb.toString();

    }
}
