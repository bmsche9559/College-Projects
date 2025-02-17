package Unit_3;
/*
 * Tennis.java - this class is a subclass of individual sports.
 * Author: Bradley Scheurich
 * Date Created: 3/11/2022
 */
public class Tennis extends Individual_sports {

	private int games_won;

/*
 * This method is the constructor method for the class and assigns variables read from the driver class.
 * 
 * Formal Parameters:
 * p_name (String) - this value is the players name
 * p_age (int) - this value is the players age.
 * p_height (String) - this value is the players height.
 * p_weight (int) - this value is the players weight.
 * won_games (int) - this value is the games won by the player.
 * Return Type: None
 */
protected Tennis (String p_name, int p_age, String p_height, int p_weight, int won_games) {
	super(p_name, p_age, p_height, p_weight);
	games_won = won_games;
}//end constructor method

/*
* This method is printing the number of games to the screen.
* 
* Formal Parameters:
* w_games (int) - the number of games won.
* 
* Return Type:
* int - this value is the number of games won.
*/
protected static int totalGames (int w_games) {
	return w_games;
}//end totalGames method

/*
 * This method is the toString method which prints a string to the screen.
 * 
 * Formal Parameters: None
 * 
 * Return Type: String
 */
public String toString() {
	return " He is a tennis player. He has won " + totalGames(games_won) + " games.";
}//end toString method
}//end Tennis class