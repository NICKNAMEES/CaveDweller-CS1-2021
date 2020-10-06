/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cavedweller;

/**
 *
 * @author 803015
 */
public class Food {
private int x, y, hpChange;
private String foodType, name;
private boolean eaten;


    public Food(String name, int x, int y   ) {
        this.x = x;
        this.y = y;
        this.hpChange = hpChange;
        this.foodType = foodType;
        this.name = name;
        this.eaten = eaten;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
public int gethpChange(){
    return hpChange;
}
public boolean isEaten(){
    return eaten;
}


public void setfood (int food) {
 
    
    
}

public String toString () {
    return "";
}

}
