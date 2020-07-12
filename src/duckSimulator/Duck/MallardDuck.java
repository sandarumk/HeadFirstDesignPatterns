package duckSimulator.Duck;

import duckSimulator.flyBehavior.FlyWithWings;
import duckSimulator.quackBehavior.Quack;

/**
 * Created by dinu
 * on 7/12/20.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quakBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck");
    }
}
