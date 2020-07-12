package duckSimulator.Duck;

import duckSimulator.flyBehavior.FlyNoWay;
import duckSimulator.quackBehavior.Quack;

/**
 * Created by dinu
 * on 7/12/20.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quakBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }


}
