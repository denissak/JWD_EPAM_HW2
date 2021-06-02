package com.company.entity;

public class Ball {
    private double weight;
    private Color color;

    private Ball() { }

    public Ball(double weight, Color color) {
        if(weight<=0) {
            System.out.println("Не правильно указан вес");
        }
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }
}
