/*
 * DrawPoly.java - This program is the main heart of the game with the main method.
 * 
 * Author: Bradley Scheurich
 * 
 * Date of Completion: 2/18/2022
 */
package Unit_2;

import javax.swing.JFrame;

public class Csci1302_hw2 {

public static void main(String args[]) {
	
	JFrame frame=new JFrame("Flappy Fly");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    DrawPoly bird = new DrawPoly();  
    frame.getContentPane().add(bird);    
    frame.pack();
    frame.setVisible(true);
}
}