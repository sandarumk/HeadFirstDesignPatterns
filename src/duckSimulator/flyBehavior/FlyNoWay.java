package duckSimulator.flyBehavior;

/**
 * Created by dinu
 * on 7/11/20.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
