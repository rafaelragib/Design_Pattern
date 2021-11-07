import FlyBehaviors.FlyWithWings;
import QuackBehaviors.Quack;

public class MallardDuck extends Duck {
  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  public void display() {
    System.out.println("I am a mallard Duck");
  }
}
