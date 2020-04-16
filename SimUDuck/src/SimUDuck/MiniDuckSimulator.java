/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimUDuck;

/**
 *
 * @author 101xo
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard =new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        
        Duck model =new ModelDuck();
        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
   }
    
    
}
