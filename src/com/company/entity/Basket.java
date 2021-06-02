package com.company.entity;

import java.util.ArrayList;

public class Basket {
    private static int count = 0;
    private ArrayList<Ball> balls;
    private double weightBasket;

    public Basket() {
        balls = new ArrayList<>();
    }

    public static int getCount() {
        return count;
    }

    public double getWeightBasket() {
        return weightBasket;
    }

    public void addBallInBasket(Ball ball) {
        if (ball == null) {
            throw new NullPointerException();
        }
        balls.add(ball);
        weightBasket += ball.getWeight();
    }

    public void removeBallInBasket(Ball ball) {
        balls.remove(ball);
        weightBasket -= ball.getWeight();
    }

    public int pickBlueBall(Color color) {
        for (Ball ball : balls) {
            if (ball.getColor() == Color.BLUE) {
                count++;
            }
        }
        return count;
    }
}
