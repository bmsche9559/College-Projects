package Unit_3;
/*
 * Team_sports.java - this class is a subclass of the driver class and a parent class of the
 * sports played as a team.
 * Author: Bradley Scheurich
 * Date Created: 3/11/2022
 */
public class Team_sports extends Csci1302_hw3 {
	protected String team_name;
	protected int num_players;
	
/*
* This method is the constructor method for the class and assigns variables for the
* other subclasses to read.
* 
* Formal Parameters:
* t_name (String) - this value is the team name.
* num_player (int) - this value is the number of players on the team.
* Return Type: None
*/
protected Team_sports (String t_name, int num_player) {
	team_name = t_name;
	num_players = num_player;
}//end constructor method

/*
 * This method is the toString method which prints a string to the screen.
 * 
 * Formal Parameters: None
 * 
 * Return Type: String
 */
public String toString() {
	return "" + team_name + " has " + num_players + " players.";
}//end toString method
}//end Team_sports class
