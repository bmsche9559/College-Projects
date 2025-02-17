package Unit_3;
/*
 * Motocross.java - this class is a subclass of individual sports.
 * Author: Bradley Scheurich
 * Date Created: 3/11/2022
 */
public class Motocross extends Individual_sports {

	private double personal_record;

/*
 * This method is the constructor method for the class and assigns variables read from the driver class.
 * 
 * Formal Parameters:
 * p_name (String) - this value is the players name
 * p_age (int) - this value is the players age.
 * p_height (String) - this value is the players height.
 * p_weight (int) - this value is the players weight.
 * record_personal (double) - this value is the players personal record.
 * Return Type: None
 */
protected Motocross (String p_name, int p_age, String p_height, int p_weight, double record_personal) {
	super(p_name, p_age, p_height, p_weight);
	personal_record = record_personal;
}//end constructor method

/*
 * This method is checking to see if the players record is above or below average.
 * 
 * Formal Parameters:
 * p_record (double) - this value is the personal record of the player.
 * 
 * Return Type:
 * String - this value is the output of above or below average to the screen.
 */
protected static String avgChecker (double p_record) {
	if (p_record > 12) {
		return "above average.";
	}
	else {
		return "below average.";
	}
}//end avgChecker method

/*
 * This method is the toString method which prints a string to the screen.
 * 
 * Formal Parameters: None
 * 
 * Return Type: String
 */
public String toString() {
	return " He is a motocross racer. His personal record is " + personal_record + " which is " +
			avgChecker(personal_record);
}//end toString method
}//end Motocross class