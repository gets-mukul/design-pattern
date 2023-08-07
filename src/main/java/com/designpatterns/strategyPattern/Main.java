package com.designpatterns.strategyPattern;

import com.designpatterns.strategyPattern.model.Duck;
import com.designpatterns.strategyPattern.strategy.fly.FastFly;
import com.designpatterns.strategyPattern.strategy.fly.IFlyStrategy;
import com.designpatterns.strategyPattern.strategy.quack.IQuackStrategy;
import com.designpatterns.strategyPattern.strategy.quack.LoudQuack;

public class Main {
    /**
     * Here we have created different strategies for fly and quack for a duck.
     * Now we just have to create a duck instance and pass the param as the strategy.
     * With this strategy we can create different types of ducks without making much changes in the existing code.
     */

    IFlyStrategy fly = new FastFly();
    IQuackStrategy quack = new LoudQuack();
    Duck duck = new Duck(quack, fly);
}
