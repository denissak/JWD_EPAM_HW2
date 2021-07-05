package com.company.sak.service;

import com.company.sak.entity.Ball;
import com.company.sak.entity.Basket;
import com.company.sak.entity.Color;
import com.company.sak.exception.MaxWeightException;
import com.company.sak.exception.NullException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasketServiceTest {

    BasketService basketService = new BasketService();
    Basket basket = new Basket();

    @Before
    public void before() throws NullException, MaxWeightException {
        basket = new Basket();
        basket.addBallInBasket(new Ball(12.1, Color.RED));
        basket.addBallInBasket(new Ball(57.0, Color.BLUE));
        basket.addBallInBasket(new Ball(1.1, Color.BLUE));
    }

    @Test
    public void testCurrentWeightBasket() throws NullException {
        double expected = 70.2;
        double actual = basketService.currentWeightBasket(basket);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testCalculateBlueBall() throws NullException {
        double expected = 2;
        double actual = basketService.calculateBlueBall(basket);
        assertEquals(expected, actual, 0.01);
    }

    @Test (expected = NullException.class)
    public void testCalculateBlueBall_isNull() throws NullException {
        int expected = 0;
        int actual  = basketService.calculateBlueBall(null);
        assertEquals(expected,actual);
    }

    @Test (expected = NullException.class)
    public void testCurrentWeightBasket_isNull() throws NullException {
        int expected = 0;
        double actual  = basketService.currentWeightBasket(null);
        assertEquals(expected,actual);
    }
}