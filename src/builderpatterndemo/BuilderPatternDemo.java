/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpatterndemo;

/**
 *
 * @author shres
 */
public class BuilderPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Pizza pizza = new Pizza.Builder(true, false)
                .setGreenPepper(true)
                .setMushroom(true)
                .setSize(14)
                .build();
        
        System.out.println(pizza);
    }
    
}
