package com.designpatterns.strategyPattern.strategy.fly;

public class NoFly implements IFlyStrategy{
    @Override
    public void fly() {
        System.out.println("I can not fly !!!");
    }
}
