package Unit_3;

import java.text.DecimalFormat;
/*
 * Horse_barrel_racing.java - this class is a subclass of individual sports.
 * Author: Bradley Scheurich
 * Date Created: 3/11/2022
 */
public class Horse_barrel_racing extends Individual_sports {

	private double personal_record;
	private double worst_record;
	
/*
 * This method is the constructor method for the class and assigns variables read from the driver class.
 * 
 * Formal Parameters:
 * p_name (String) - this value is the players name
 * p_age (int) - this value is the players age.
 * p_height (String) - this value is the players height.
 * p_weight (int) - this value is the players weight.
 * record_personal (double) - this value is the players personal record.
 * record_worst (double) - this value is the players worst record.
 * Return Type: None
 */
protected Horse_barrel_racing (String p_name, int p_age, String p_height, int p_weight, double record_personal, double record_worst) {
	super(p_name, p_age, p_height, p_weight);
	personal_record = record_personal;
	worst_record = record_worst;
}//end constructor method

/*
 * This method is finding the average time between his personal record and his worst record.
 * 
 * Formal Parameters:
 * p_record (double) - this value is the personal record time.
 * w_record (double) - this value is the worst record time.
 * 
 * Return Type:
 * String - this value is the average of the two times.
 */
protected static String avgTime (double p_record, double w_record) {
	final DecimalFormat df = new DecimalFormat("0.00");
	double Val = (p_record + w_record) / 2;
	return df.format(Val);
}//end avgTime method

/*
* This method is the toString method which prints a string to the screen.
* 
* Formal Parameters: None
* 
* Return Type: String
*/
public String toString() {
	return " They are a horse barrel racer. Their personal record for time is " + personal_record + ", thier worst record is " + worst_record +
			" which makes their average time " +
			avgTime(personal_record, worst_record);
}//end toString method
}//end Horse_barrel_racing class
