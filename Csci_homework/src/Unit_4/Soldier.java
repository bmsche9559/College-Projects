/*
 * Soldier.java - this file is a subclass of Csci1302_hw4 and initializes the constant variables allong with a toString method to
 * override each print statement.
 * Author: Bradley Scheurich
 * Date Completed: 4/7/2022
 */
package Unit_4;

public class Soldier extends Csci1302_hw4 {

	String rank, first_name, last_name;
	int years_served;

/*
 * this is the constructor method of the class and is responsible for creating the variables for a parent class
 * Formal Parameters:
 * s_rank(String): rank of the soldier
 * s_first_name(String): first name of the soldier
 * s_last_name(String): last name of the solider
 * s_years_served(int): number of years soldier served
 * Return Type: none
 */
public Soldier(String s_rank, String s_first_name, String s_last_name, int s_years_served) {
		this.rank = s_rank;
		this.first_name = s_first_name;
		this.last_name = s_last_name;
		this.years_served = s_years_served;
}//end constructor method

/*
 * This method is responsible for overriding each print statement to print this return statement.
 * Formal Parameters: None
 * Return Type: String - returns what will be printed to the console.
 */
public String toString() {
		return rank + " " + first_name + " " + last_name + " has been in service for " + years_served + " years.";
}//end toString method
}//end soldier class
