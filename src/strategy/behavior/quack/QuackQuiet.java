package strategy.behavior.quack;

public class QuackQuiet implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("조용히 꽉꽉");
    }
}
