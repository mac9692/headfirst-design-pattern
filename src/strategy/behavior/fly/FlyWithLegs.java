package strategy.behavior.fly;

public class FlyWithLegs implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("다리로 날아");
    }
}
