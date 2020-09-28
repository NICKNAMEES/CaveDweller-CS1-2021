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
public class Cave {
    private double temp;
    private int size, amount;
    private Bat bat;
    private Caveman caveman;
    private Key key;
    private Food food1;
    private Door door;
    public Cave (){
        this.temp = Math.random()  * 100;
        this.size = (int) (Math.random () *11) + 6;
        //instantiate 
        this.caveman = new Caveman ("Grog", (int) (Math.random() * this.size),(int) Math.random());
        this.food1 = new Food ("Meat", (int) (Math.random()* this.amount), (int) Math.random());
    }
   public void handleInput(String input){
   if(input.trim().equalsIgnoreCase("up")){
        caveman.moveUp();
   }
        else if(input.trim().equalsIgnoreCase("down")) {
            caveman.moveDown();    
        }
        else if(input.trim().equalsIgnoreCase("left")) {
        caveman.moveLeft();
        }
        else if(input.trim().equalsIgnoreCase("right")) {
        caveman.moveRight();
        }
        else if(input.trim().equalsIgnoreCase("close")) {
        System.exit(0);
        
   }
   else {
        System.out.println("(command not valid)");
                }
   System.out.println(caveman.toString());
    public String toString(){
    return ""+size;
    }
}
