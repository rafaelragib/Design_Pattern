public class Mocha extends CondimentDecorator {

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }

  public double cost() {
    double bevarageCost = beverage.cost();
    if(beverage.getSize() == Size.Small) {
      return bevarageCost += .10;
    }
    else if(beverage.getSize() == Size.medium) {
      return bevarageCost += .15;
    }
    else if(beverage.getSize() == Size.large) {
      return bevarageCost += .20;
    }
    return 0;
  }
}
