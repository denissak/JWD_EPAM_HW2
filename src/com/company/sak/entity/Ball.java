package com.company.sak.entity;

import java.io.Serializable;

public class Ball implements Serializable {
    private double weight;
    private Color color;

    public Ball(double weight, Color color) {
        if (weight > 0) {
            this.weight = weight;
            this.color = color;
        }
    }

    public double getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball other = (Ball) o;
        if (this.weight != other.weight) {
            return false;
        }
        if (this.color != other.color) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return color.hashCode() + (int) (31 * weight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ваш мячик имеет цвет ");
        sb.append(getColor());
        sb.append(" и вес ");
        sb.append(getWeight());
        return sb.toString();
    }
}
