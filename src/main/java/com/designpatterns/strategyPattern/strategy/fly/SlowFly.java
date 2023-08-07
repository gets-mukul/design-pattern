package com.designpatterns.strategyPattern.strategy.fly;

public class SlowFly implements IFlyStrategy{
    @Override
    public void fly() {
        System.out.println("I am a slow duck !!!");
    }
}
