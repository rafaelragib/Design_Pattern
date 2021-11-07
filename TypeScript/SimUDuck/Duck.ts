import {FlyBehavior, QuackBehavior} from "./Behaviors";

export abstract class Duck {
  flyBehavior: FlyBehavior;
  quackBehavior: QuackBehavior;
  
  abstract display():void;

  performFly(): void {
    this.flyBehavior.fly();
  }
  performQuack(): void {
    this.quackBehavior.quack();
  }
  swim(): void {
    console.log('All ducks swim');
  }
}