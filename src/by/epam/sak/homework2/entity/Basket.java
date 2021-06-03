package by.epam.sak.homework2.entity;

import java.util.ArrayList;
import java.util.List;

public class Basket  {

    private static final double MAX_WEIGTBASKET = 20_000.00;
    private static int count = 0;
    private List<Ball> balls;
    private double weightBasket;

    public Basket() {
        balls = new ArrayList<>();
    }

    public double getWeightBasket() {
        return weightBasket;
    }

    public void addBallInBasket(Ball ball) {
        if (ball != null && weightBasket+ball.getWeight()<MAX_WEIGTBASKET) {
            balls.add(ball);
            weightBasket += ball.getWeight();
        }
    }

    public void removeBallInBasket(Ball ball) {
        balls.remove(ball);
        weightBasket -= ball.getWeight();
    }

    public int pickBlueBall() {
        for (Ball ball : balls) {
            if (ball.getColor() == Color.BLUE) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "Кол-во синих мячиков " + pickBlueBall() + ", вес всех мячей: " + getWeightBasket();
    }
}
