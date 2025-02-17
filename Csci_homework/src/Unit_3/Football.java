package Unit_3;

import java.text.DecimalFormat;
/*
 * Football.java - this class is a subclass of team sports.
 * Author: Bradley Scheurich
 * Date Created: 3/11/2022
 */
public class Football extends Team_sports {

	private int numFumbles;
	private int numTouchdowns;
	private int numIncomplete;
	private int numComplete;
	private int numPasses;

	/*
	* This method is the constructor method for the class and assigns
	* variables from the driver class.
	* 
	* Formal Parameters:
	* t_name (String) - this value is the team name.
	* num_player (int) - this value is the number of players on the team.
	* numberFumbles (int) - this value is the number of fumbles in the game.
	* numberTouchdown (int) - this value is the number of touchdowns by the team in the game.
	* incompleteNum (int) - this value is the number of incomplete passes by the team.
	* completeNum (int) - this value is the number of complete passes by the team.
	* passesNum (int) - this value is the number of passes by the team.
	* Return Type: None
	*/
protected Football (String t_name, int num_player, int numberFumbles, int numberTouchdowns, int incompleteNum, int completeNum, int passesNum) {
	super(t_name, num_player);
	numFumbles = numberFumbles;
	numTouchdowns = numberTouchdowns;
	numIncomplete = incompleteNum;
	numComplete = completeNum;
	numPasses = passesNum;
}//end constructor method

/*
* This method is calculating the pass completion average.
* 
* Formal Parameters:
* numberComplete (int) - the number of completed passes.
* passesNumber (int) - the number of passes thrown.
* 
* Return Type:
* String - this value is the average of completed passes
*/
protected static String completePassAvg (int numberComplete, int passesNumber) {
	double tempVal;
	final DecimalFormat df = new DecimalFormat("0.00");
	tempVal = (double)numberComplete / passesNumber;
	return df.format(tempVal);
}//end completePassAvg method

/*
 * This method is the toString method which prints a string to the screen.
 * 
 * Formal Parameters: None
 * 
 * Return Type: String
 */
public String toString() {
	return " They are a football team. Their number of fumbles is " + numFumbles + ", their number of touchdowns is " + numTouchdowns +
			", their number of complete passes is " + numComplete + " and incomplete passes is " + numIncomplete +
			" and num of total passes is " + numPasses + " which makes their completion average " +  completePassAvg(numComplete, numPasses) + "%.";
}//end toString method
}//end Football class
