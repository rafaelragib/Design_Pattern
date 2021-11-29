public class Espresso extends Beverage {
  String size;
  public Espresso() {
    description = "Espresso";
  }
  
  public double cost() {
    return 1.99;
  }

  public String getString() {
    return size;
  }

  public void setString(String size) {
    this.size = size;
  }
}
