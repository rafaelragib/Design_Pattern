import {FlyBehavior} from "./Behaviors";

export class FlyWithWings implements FlyBehavior {

  fly(): void {
    console.log('I am Flying');
  }

}

export class FlyNoWay implements FlyBehavior {
  fly(): void {
    console.log('I can\'t fly');
  }
}