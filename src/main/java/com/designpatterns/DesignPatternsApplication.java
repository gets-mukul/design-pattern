package com.designpatterns;

import com.designpatterns.strategyPattern.model.Duck;
import com.designpatterns.strategyPattern.strategy.fly.FastFly;
import com.designpatterns.strategyPattern.strategy.fly.IFlyStrategy;
import com.designpatterns.strategyPattern.strategy.quack.IQuackStrategy;
import com.designpatterns.strategyPattern.strategy.quack.LoudQuack;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);

		FastFly fly = new FastFly();
		LoudQuack quack = new LoudQuack();
		Duck duck = new Duck(quack, fly);
		duck.fly();
		duck.quack();
	}

}
