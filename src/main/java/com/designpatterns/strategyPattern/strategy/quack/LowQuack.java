package com.designpatterns.strategyPattern.strategy.quack;

public class LowQuack implements IQuackStrategy {
    @Override
    public void quack() {
        System.out.println("This is a low quack !!!");
    }
}
