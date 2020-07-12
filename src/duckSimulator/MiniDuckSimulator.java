package duckSimulator;

import duckSimulator.Duck.Duck;
import duckSimulator.Duck.MallardDuck;
import duckSimulator.Duck.ModelDuck;
import duckSimulator.flyBehavior.FlyRocketPowered;

/**
 * Created by dinu
 * on 7/12/20.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
