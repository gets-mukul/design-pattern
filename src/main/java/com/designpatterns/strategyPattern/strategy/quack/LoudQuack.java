package com.designpatterns.strategyPattern.strategy.quack;

import com.designpatterns.strategyPattern.strategy.quack.IQuackStrategy;

public class LoudQuack implements IQuackStrategy {

    @Override
    public void quack() {
        System.out.println("This is a loud quack !!!");
    }
}
