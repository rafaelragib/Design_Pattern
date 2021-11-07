import {QuackBehavior} from "./Behaviors";

export class Quack implements QuackBehavior {

  quack(): void {
    console.log('Quack!');
  }

}

export class MuteQuack implements QuackBehavior {
  quack(): void {
    console.log('No quack!');
  }
}