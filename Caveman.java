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
public class Caveman {
   private String name;
   private int hp, x, y, hpChange;
private boolean hasKey;


//feilds/instance variables
//Constructor
public Caveman (String name, int x, int y) {
    this.hp = 100;
    this.hasKey = false;
    this.name = name;
    this.x = x;
    this.y = y;
}
//Methods
public void speak(){
System.out.println("Grr");
}

public void eat( Food food){
    this.hp += food.gethpChange();
    food.setEaten(true);
System.out.println("Me eat"+food.getName());
}
public void pickUpKey (){
    hasKey = true;
}
public void openDoor (){
    if(hasKey == true){
    System.out.println("Caveman Escaped");
            System.exit(0);
    }
    else {
    System.out.println("Uou haven't found the key yet!");
    }
}
public String toString (){
return "x: "+x+", y: "+y;
}
public void moveUp() {//y tracks how far down
    y -=1;
    
}
public void moveDown() {
y += 1;
}
public void moveLeft(){
x -=1;
}
public void moveRight(){
x += 1;
}
//Accessors
public int  getHP() {
return hp;
}
public void setHp (int hp) {
if (hp <= 100 && hp >= 0 )
this.hp = hp;
}
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isHasKey() {
        return hasKey;
    }
}