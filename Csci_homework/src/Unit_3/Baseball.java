package Unit_3;
/*
 * Baseball.java - this class is a subclass of team sports.
 * Author: Bradley Scheurich
 * Date Created: 3/11/2022
 */
public final class Baseball extends Team_sports {

	private int win_percentage;
	private int home_run_percentage;

/*
* This method is the constructor method for the class and assigns variables
* from the driver class.
* 
* Formal Parameters:
* t_name (String) - this value is the team name.
* num_player (int) - this value is the number of players on the team.
* w_percentage (int) - this value is the percentage of games won by the team.
* hr_percentage (int) - this value is the home run percentage of the team.
* Return Type: None
*/
protected Baseball (String t_name, int num_player, int w_percentage, int hr_percentage) {
	super(t_name, num_player);
	win_percentage = w_percentage;
	home_run_percentage = hr_percentage;
}//end constructor method

/*
* This method is checking to see if the number of wins is above or below average.
* 
* Formal Parameters:
* wins (int) - the number of wins by the team.
* 
* Return Type:
* String - this value is printing if the above or below average to the screen.
*/
protected static String winDifference (int wins) {
	int avg_win_percentage = 15;
	if (wins > avg_win_percentage) {
		return "Above average";
	}
	else {
		return "Below average";
	}//end if else statement
}//end winDifference method

/*
 * This method is the toString method which prints a string to the screen.
 * 
 * Formal Parameters: None
 * 
 * Return Type: String
 */
public String toString() {
	return " They are a baseball team. Their home run percentage is " + home_run_percentage + " and their win percentage is " + winDifference(win_percentage) + ".";
}//end toString method
}//end Baseball class
