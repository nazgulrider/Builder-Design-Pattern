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

//classes declared final in java cannot be overridden i.e. subclasses cannot
//override superclass methods therefore increasing the immutability of the class
public final class Pizza {
    private final boolean cheese; //required
    private final boolean extraCheese; //optional
    private final boolean sauce; //required
    private final boolean pepperoni; //optional
    private final boolean mushroom; //optional
    private final boolean greenPepper; //optional
    private final int size;
    
    private Pizza(Builder builder){ 
        this.cheese=builder.cheese;
        this.extraCheese=builder.extraCheese;
        this.greenPepper=builder.greenPepper;
        this.pepperoni=builder.pepperoni;
        this.mushroom=builder.mushroom;
        this.sauce=builder.sauce;
        this.size=builder.size;
    }
//All getters and no setters to provide immutability
    public boolean hasCheese() {
        return cheese;
    }

    public boolean hasExtraCheese() {
        return extraCheese;
    }

    public boolean hasSauce() {
        return sauce;
    }

    public boolean hasPepperoni() {
        return pepperoni;
    }

    public boolean hasMushroom() {
        return mushroom;
    }

    public boolean hasGreenPepper() {
        return greenPepper;
    }

    public int getSize() {
        return size;
    }
    
    public static class Builder{
        private boolean cheese;
        private boolean extraCheese;
        private boolean sauce;
        private boolean pepperoni;
        private boolean mushroom;
        private boolean greenPepper;
        private int size;
        
        public Builder(boolean cheese, boolean sauce){
            this.cheese=cheese;
            this.sauce=sauce;
        }

        public Builder setExtraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }

        public Builder setPepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public Builder setMushroom(boolean mushroom) {
            this.mushroom = mushroom;
            return this;
        }

        public Builder setGreenPepper(boolean greenPepper) {
            this.greenPepper = greenPepper;
            return this;
        }

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }
        
        //Return the constructed Pizza object
        public Pizza build(){
            Pizza pizza = new Pizza(this);
            return pizza;
        }
        
        
    }
    
    public String toString(){
        String pizza = "cheese ="+cheese+" extraCheese ="+extraCheese
                +" sauce ="+sauce+" greenPepper ="+greenPepper
                +" mushroom ="+mushroom+" pepperoni ="+pepperoni+" size ="+size;
        return pizza;
    }
    
}
