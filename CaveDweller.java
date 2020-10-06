/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cavedweller;

import java.util.Scanner;

/**
 *
 * @author 803015
 */
public class CaveDweller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cave cave = new Cave();
       
        System.out.println (cave.toString());
        System.out.println(cave.toString());
        Scanner kboard = new Scanner(System.in);
        String input = "";
        while (!input.equals("close")){
        input = kboard.nextLine();
        cave.handleInput(input);
    }
    }
}
