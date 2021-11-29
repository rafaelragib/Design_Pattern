
public class App {
    public static void main(String[] args) throws Exception {
        Beverage beverage = new Espresso();
        beverage.setSize(Beverage.Size.medium);
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription());
        System.out.println(beverage2.cost());

    }
}
