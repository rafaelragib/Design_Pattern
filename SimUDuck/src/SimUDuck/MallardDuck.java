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
public class MallardDuck extends Duck {
    public MallardDuck()
    {
        quackBehavior = new Quack();
        flyBehavior =new FlyWithWings();
    }
    public void display()
    {
        System.out.println("I'm A Mallard Duck");
    }
    
}
