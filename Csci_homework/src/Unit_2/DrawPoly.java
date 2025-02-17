/*
 * DrawPoly.java - This program is the main heart of the game and does all of the drawing and
 * animation of the game.
 * 
 * Author: Bradley Scheurich
 * 
 * Date of Completion: 2/18/2022
 */
package Unit_2;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class DrawPoly extends JPanel {
    
	int current_x = 300;
    int birdx=0;//a starting x location variant, this will adjust as the mouse moves
    int birdy=0;//a starting y location variant, this currently is just a placeholder for mouse movement in the y plane
    int currentScore = 0;
    int highScore = 0;
    boolean game_paused = true;
    boolean game_over = false;
    boolean hover = false;
    
    int pipex1=0;
    int pipey1=0;
    int pipex2=0;
    int pipey2=0;
    int wingx1=0;
    int wingy1=0;
    int wingx2=0;
    int wingy2=0;
    int beakx=0;
    int beaky=0;
    int eyex=0;
    int eyey=0;
    
    Random rnum = new Random();//random number object

public DrawPoly() {  
	PolygonPanel listener = new PolygonPanel();  //create a polygon listener
	addMouseListener(listener);  //listen for mouse changes 
	addMouseMotionListener(listener);  //listen for mouse movement
	addKeyListener(listener);  //listen for key press
	setFocusable(true); //necessary for key press to be 'seen' in JPanel
	setPreferredSize(new Dimension(600,800)); //set default size of JFrame window 
}//end constructor class
/*
 * This method is responsible for drawing the game and animating the objects to move on the screen.
 * Formal Parameters:
 * page(graphics) - this is the parameter that draws the plotted points in the following code.
 * Return Type:
 * graphics - graphics printed onto the jframe.
 */
public void paintComponent(Graphics page) {
	
  super.paintComponent(page);
  
  if (game_paused == false && game_over == false) {
	  setBackground(Color.blue);
	  page.setColor(new Color (156,106,72));
 
	  int[] xloc_bird = {birdx+290,birdx+290,birdx+300,birdx+290,birdx+310,birdx+300,birdx+310,birdx+310};
	  int[] yloc_bird = {birdy+670,birdy+700,birdy+720,birdy+740,birdy+740,birdy+720,birdy+700,birdy+670};
	  page.fillPolygon(xloc_bird,yloc_bird,xloc_bird.length);  //this does the actual drawing of the body of the bird   
  
	  //create and draw pipe
	  int[] x_pipe1 = {current_x-75,current_x-105,current_x-105,current_x-1000,current_x-1000,current_x-105,current_x-105,current_x-75};
	  int[] y_pipe1 = {pipey1+100,pipey1+100,pipey1+70,pipey1+70,pipey1+30,pipey1+30,pipey1+0,pipey1+0};
  
	  int[] x_pipe2 = {current_x+75,current_x+105,current_x+105,current_x+1000,current_x+1000,current_x+105,current_x+105,current_x+75};
	  int[] y_pipe2 = {pipey2+100,pipey2+100,pipey2+70,pipey2+70,pipey2+30,pipey2+30,pipey2+0,pipey2+0};
  
	  page.setColor(Color.green);  //set color for the pipe
	  page.fillPolygon(x_pipe1,y_pipe1,x_pipe1.length);  //this does the actual drawing of the pipe   
	  page.drawPolygon(x_pipe1,y_pipe1,x_pipe1.length);  //this does the actual drawing of the pipe 
	  page.fillPolygon(x_pipe2,y_pipe2,x_pipe2.length);  //this does the actual drawing of the pipe   
	  page.drawPolygon(x_pipe2,y_pipe2,x_pipe2.length);  //this does the actual drawing of the pipe
	  //moves pipe down screen until it reaches bottom
	  if (pipey1 > 800 && pipey2 > 800) {
    	pipey1 = -100;
    	pipey2 = -100;
    	current_x = rnum.nextInt(30,570);
	  }
	  else {
    	pipey1 = pipey1 + 1;
    	pipey2 = pipey2 + 1;
	  }
    
	  //creating and drawing the wings of bird. Also animating them to look like they are flapping
	  if (pipey1 <= 400) {
		  int[] x_wing1pos1 = {wingx1+290,wingx1+270,wingx1+290};
		  int[] y_wing1pos1 = {wingy1+670,wingy1+710,wingy1+700};
		  int[] x_wing2pos1 = {wingx2+310,wingx2+330,wingx2+310};
		  int[] y_wing2pos1 = {wingy2+670,wingy2+710,wingy2+700};
		  page.setColor(new Color (156,80,72));
		  page.fillPolygon(x_wing1pos1,y_wing1pos1,x_wing1pos1.length);  //this does the actual drawing of the wing   
		  page.drawPolygon(x_wing1pos1,y_wing1pos1,x_wing1pos1.length);  //this does the actual drawing of the wing 
		  page.fillPolygon(x_wing2pos1,y_wing2pos1,x_wing2pos1.length);  //this does the actual drawing of the wing   
		  page.drawPolygon(x_wing2pos1,y_wing2pos1,x_wing2pos1.length);  //this does the actual drawing of the wing
	 }//end if statement 
	  if (pipey1 >= 400) {
		  int[] x_wing1pos2 = {wingx1+290,wingx1+270,wingx1+290};
		  int[] y_wing1pos2 = {wingy1+670,wingy1+660,wingy1+700};
		  int[] x_wing2pos2 = {wingx2+310,wingx2+330,wingx2+310};
		  int[] y_wing2pos2 = {wingy2+670,wingy2+660,wingy2+700};
		  page.setColor(new Color (156,80,72));
		  page.fillPolygon(x_wing1pos2,y_wing1pos2,x_wing1pos2.length);  //this does the actual drawing of the wing   
		  page.drawPolygon(x_wing1pos2,y_wing1pos2,x_wing1pos2.length);  //this does the actual drawing of the wing 
		  page.fillPolygon(x_wing2pos2,y_wing2pos2,x_wing2pos2.length);  //this does the actual drawing of the wing   
		  page.drawPolygon(x_wing2pos2,y_wing2pos2,x_wing2pos2.length);
	  }//end if statement
    
	  //creating and drawing beak of bird
	  int[] x_beak = {beakx+290,beakx+300,beakx+310};
	  int[] y_beak = {beaky+670,beaky+660,beaky+670};
	  page.setColor(Color.orange);
	  page.fillPolygon(x_beak,y_beak,x_beak.length);  //this does the actual drawing of the beak   
	  page.drawPolygon(x_beak,y_beak,x_beak.length);

	  //drawing the eye of the bird
	  page.setColor(Color.black);
	  page.fillOval(eyex+290, eyey+672, 5, 5);
	  page.fillOval(eyex+305, eyey+672, 5, 5);
	  //if statements used to detect when the bird hits the pipe and ends the game
	  if (pipey1 == 660 && pipey2 == 660) {
		  if ((wingx1 + 270) < (current_x-75) || (wingx2 + 330) > (current_x+75)) {
			  game_over = true;
		  }//end if statement
		  else {
			 currentScore++;
			 if (currentScore > highScore) {
    			highScore = currentScore;
    		}//end if statement
		  }//end else statement
	  }//end if statement
  	}//end if statement
  
    //opening splash screen for game including title, instructions, and start button
    if (game_over == false && game_paused == true) {
    	setBackground(Color.black);
    	Font titlefont = new Font("SansSerif", Font.BOLD, 50);
    	page.setFont(titlefont);
    	page.setColor(Color.green);
    	page.drawString("Flappy Fly", 190, 150);
    	Font instructions = new Font("SansSerif", Font.PLAIN, 20);
    	page.setFont(instructions);
    	page.drawString("Use the left and right arrow keys to move side to side.", 60, 200);
    	page.drawString("Avoid the pipes!", 230, 225);
    	page.setColor(Color.red);
    	page.drawRect(210, 400, 200, 100);
    	page.fillRect(210, 400, 200, 100);
    	Font start = new Font("SansSerif", Font.BOLD, 45);
    	page.setFont(start);
    	page.setColor(Color.blue);
    	page.drawString("START", 240, 470);
    }//end if statement
    
    //game over screen with final score
    if (game_over == true) {
    	setBackground(Color.black);
    	Font titlefont = new Font("SansSerif", Font.BOLD, 40);
    	page.setFont(titlefont);
    	page.setColor(Color.red);
    	page.drawString("GAME OVER!", 180, 200);
    	Font instructions = new Font("SansSerif", Font.PLAIN, 40);
    	page.setFont(instructions);
    	page.drawString("Final Score: " + currentScore, 180, 250);
    	page.drawString("High Score: " + highScore, 185, 300);
    	page.setColor(Color.red);
    	page.drawRect(205, 400, 200, 100);
    	page.fillRect(205, 400, 200, 100);
    	Font start = new Font("SansSerif", Font.BOLD, 45);
    	page.setFont(start);
    	page.setColor(Color.blue);
    	page.drawString("REPLAY", 220, 470);
    }
    repaint();
} //end paintComponent
/*
 * This method is responsible for listening to the mouse and keyboard for certain actions.
 * Formal Parameters:
 * MouseListener - listens for actions from the mouse.
 * MouseMotionListener - listens for motion from the mouse.
 * KeyListener - listens for keyboard actions.
 * Return Type:
 * repaint() - takes those actions and repaints the screen.
 */
private class PolygonPanel implements MouseListener, MouseMotionListener, KeyListener
{
  
//tells the paint component to move left or right when arrow keys are pressed.
 public void keyPressed(KeyEvent event) {
	 if (event.getKeyCode() == KeyEvent.VK_LEFT) {
		 birdx -= 50;
		 beakx -= 50;
		 wingx1 -= 50;
		 wingx2 -= 50;
		 eyex -= 50;
	 }//end if statement
	 if (event.getKeyCode() == KeyEvent.VK_RIGHT) {
		 birdx += 50;
		 beakx += 50;
		 wingx1 += 50;
		 wingx2 += 50;
		 eyex += 50;
	 }//end if statement
	 repaint();
 }//end keypressed method
  public void keyReleased(KeyEvent event){} //unused event
  public void keyTyped(KeyEvent event){} //unused event
  public void mousePressed(MouseEvent event){} //unused event
  public void mouseDragged(MouseEvent event){} //unused event
  
 //tells the animation to start when the mouse is clicked on the button.
  public void mouseClicked(MouseEvent event){
	  if (event.getX() > 210 && event.getX() < 410) {
		  if (event.getY() > 400 && event.getY() < 500) {
			  game_paused = false;
			  if (game_over == true) {
				  game_over = false;
			  }//end if statement
			  currentScore = 0;
		  }//end if statement
	  }//end if statement
  }//end mouseclicked method
  public void mouseReleased(MouseEvent event) {}  //unused event
  public void mouseEntered(MouseEvent event) {}   //unused event
  public void mouseExited(MouseEvent event) {}    //unused event
  public void mouseMoved(MouseEvent event) {}
 
}  //end PolygonPanel
}//end DrawPoly class