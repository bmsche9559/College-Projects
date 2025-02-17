package Unit_3;
/*
 * Basketball.java - this class is a subclass of team sports.
 * Author: Bradley Scheurich
 * Date Created: 3/11/2022
 */
public class Basketball extends Team_sports {

	private int games_played;
	private int shots_taken;
	
/*
* This method is the constructor method for the class and assigns
* variables from the driver class
* 
* Formal Parameters:
* t_name (String) - this value is the team name.
* num_player (int) - this value is the number of players on the team.
* game_played (int) - this value is the amount of games played by the team.
* shot_taken (int) - this value is the amount of shots taken during the season.
* Return Type: None
*/
protected Basketball (String t_name, int num_player, int game_played, int shot_taken) {
	super(t_name, num_player);
	games_played = game_played;
	shots_taken = shot_taken;
}//end constructor method

/*
* This method is calculating the average shots taken per game.
* 
* Formal Parameters:
* played_games (int) - this value is the number of games played by the team.
* takenShots (int) - this value is the number of shots taken in the season.
* 
* Return Type:
* int - the average of shots taken per game
*/
protected static int avgShotPerGame (int played_games, int takenShots) {
	return takenShots / played_games;
}//end winDifference method

/*
 * This method is the toString method which prints a string to the screen.
 * 
 * Formal Parameters: None
 * 
 * Return Type: String
 */
public String toString() {
	return " They are a basketball team. Their amount of games played is " + games_played + " and their amount of shots taken is " + shots_taken +
			" Which makes their shots per game " + avgShotPerGame(games_played, shots_taken) + ".";
}//end toString method
}//end Basketball class