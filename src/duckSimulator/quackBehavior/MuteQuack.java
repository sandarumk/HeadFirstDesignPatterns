package duckSimulator.quackBehavior;

/**
 * Created by dinu
 * on 7/12/20.
 */
public class MuteQuack implements QuakBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
