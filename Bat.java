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
public class Bat {
    //fields- Instance Variable
  private boolean alive;
  private int x, y, damage;
  //Constructor
  public Bat (int x, int y){
   this.x = x;
   this.y = y;
   this.alive = true;
   this.damage = 4;
  }
  //Methods
  public void moveAround(){
     x += (int) (Math.random() *5) -2;
    y += (int) (Math.random() *5) -2;
  }
      //increase/decrease x by random number
      //increase/decrease y by random number
      public void bite (Caveman caveman) {
      int newHP = caveman getHP()- damage ;
      caveman.setHP ();
  }
      
  //Acessors

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
