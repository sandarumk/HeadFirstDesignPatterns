package duckSimulator.Duck;

import duckSimulator.flyBehavior.FlyBehavior;
import duckSimulator.quackBehavior.QuakBehavior;

/**
 * Created by dinu
 * on 7/11/20.
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuakBehavior quakBehavior;

    Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quakBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float. Even decoys!");
    }

    public void setQuakBehavior(QuakBehavior quakBehavior) {
        this.quakBehavior = quakBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

}
