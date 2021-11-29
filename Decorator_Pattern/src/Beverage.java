public abstract class Beverage {
  String description = "Unknown Beverage";
  public enum Size {Small, medium ,large};
  Size size = Size.Small;
  public String getDescription() {
    return description;
  }
  public abstract double cost();

  public Size getSize() {
    return size;
  }
  
  public void setSize(Size size) {
    this.size = size;
  }

}