import FlyBehaviors.FlyNoWay;

public class Main {
    public static void main(String[] args) throws Exception {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        mallard.setFlyBehavior(new FlyNoWay());

        mallard.performFly();
    }
}
