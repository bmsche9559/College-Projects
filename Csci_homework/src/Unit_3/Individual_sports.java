package Unit_3;
/*
 * Individual_sports.java - This program is a subclass of the driver class and a parent class of 
 * the sports that are played individually.
 * Author: Bradley Scheurich
 * Date Created: 3/11/2022
 */
public class Individual_sports extends Csci1302_hw3 {
	
	protected String player_name;
	protected int player_age;
	protected String player_height;
	protected int player_weight;
	
/*
 * This method is the constructor method for the class and assigns variables for the
 * other subclasses to read.
 * 
 * Formal Parameters:
 * p_name (String) - this value is the players name
 * p_age (int) - this value is the players age.
 * p_height (String) - this value is the players height.
 * p_weight (int) - this value is the players weight.
 * Return Type: None
 */
protected Individual_sports (String p_name, int p_age, String p_height, int p_weight) {
	player_name = p_name;
	player_age = p_age;
	player_height = p_height;
	player_weight = p_weight;
}//end constructor method

/*
 * This method is the toString method which prints a string to the screen.
 * 
 * Formal Parameters: None
 * 
 * Return Type: String
 */
public String toString() {
	return "The players name is " + player_name + ", their age is " + player_age + ", their height is " +
			player_height + " and their weight is " + player_weight + ".";
}//end toString method
}//end Team_sports class