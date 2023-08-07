package com.designpatterns.strategyPattern.strategy.fly;

public class FastFly implements IFlyStrategy{
    @Override
    public void fly() {
        System.out.println("I am a fast Duck !!!");
    }
}
