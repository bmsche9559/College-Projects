package Unit_3;
/*
 * Horse_polo.java - this class is a subclass of team sports.
 * Author: Bradley Scheurich
 * Date Created: 3/11/2022
 */
public class Horse_polo extends Team_sports {

	private String jersey_Color;
	private int team_Score;
	private int opponent_Score;
	
	/*
* This method is the constructor method for the class and assigns
* variables from the driver class.
* 
* Formal Parameters:
* t_name (String) - this value is the team name.
* num_player (int) - this value is the number of players on the team.
* color_jersey (String) - this value is the jersey color of the team.
* score_team (int) - this value is the score by the team.
* score_opponent (int) - this value is the opponents score.
* Return Type: None
*/
protected Horse_polo (String t_name, int num_player, String color_Jersey, int score_Team, int score_Opponent) {
	super(t_name, num_player);
	jersey_Color = color_Jersey;
	team_Score = score_Team;
	opponent_Score = score_Opponent;
}//end constructor method

/*
* This method is calculating the difference between the two teams score.
* 
* Formal Parameters:
* t_score (int) - the final score by the team.
* o_score (int) - the final score by the opponent team.
* 
* Return Type:
* int - the difference between the two scores.
*/
protected static int scoreDifference (int t_Score, int o_Score) {
	int Val = t_Score - o_Score;
	if (Val < 0) {
		return o_Score - t_Score;
	}
	else {
		return Val;
	}
}//end scoreDifference method

/*
 * This method is the toString method which prints a string to the screen.
 * 
 * Formal Parameters: None
 * 
 * Return Type: String
 */
public String toString() {
	return " they are a horse polo team. Their jersey color is " + jersey_Color + ". Their score of the game was " + team_Score +
			" and their opponents score was " + opponent_Score + " which means they won or lost by " +
			scoreDifference(team_Score, opponent_Score) + ".";
}//end toString method
}//end Horse_Polo class
