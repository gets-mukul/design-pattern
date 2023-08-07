package com.designpatterns.strategyPattern.model;

import com.designpatterns.strategyPattern.strategy.fly.IFlyStrategy;
import com.designpatterns.strategyPattern.strategy.quack.IQuackStrategy;

public class Duck {

    IQuackStrategy quackStrategy;
    IFlyStrategy flyStrategy;

    public Duck(IQuackStrategy quackStrategyType, IFlyStrategy flyStrategyType) {
        this.quackStrategy = quackStrategyType;
        this.flyStrategy = flyStrategyType;
    }

    public void fly(){
        this.flyStrategy.fly();
    }

    public void quack(){
        this.quackStrategy.quack();
    }

}
