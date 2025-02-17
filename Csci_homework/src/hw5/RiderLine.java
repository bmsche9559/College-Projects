/*
 * RiderLine.java - this file contains the linked list and all of its controls.
 * Author - Bradley Scheurich
 * Date of Completion - 4/29/2022
 */
package hw5;

import java.util.LinkedList;
import java.util.Random;

class RiderLine extends Csci1302_hw5{

	/*
	 * RiderLine - this method is responsible for sharing information between this class and the parent class
	 * String[] first_names - the array of first names used for creating each rider.
	 * LinkedList<String> guest - sharing the linked list between the parent class.
	 * Return Type - none
	 */
    public RiderLine(String[] first_names, LinkedList<String> guest) {
    	String[] names = first_names;
    }//end constructor method

	static LinkedList<String> guest = new LinkedList<>();
	static Random gen = new Random();
	
	/*
	 * Add - this method adds the created riders into the linked list.
	 * newRider (String) - this contains the first name of the rider.
	 * Return Type - none
	 */
	public static void Add (String newRider) {
		guest.add(newRider);
	}//end Add method
	
	/*
	 * Remove - this method removes the rider from the front of the list
	 * None
	 * Return Type - String - returns the name of the rider removed.
	 */
	public static String Remove() {
		return guest.removeFirst();
	}//end Remove method
	
	/*
	 * Empty - checks if the linked list is currently empty.
	 * None
	 * Return Type - Boolean - Returns true if the list is empty and false if it is not
	 */
	public static Boolean Empty() {
		return guest.isEmpty();
	}//end isEmpty method
	
	/*
	 * Size - this method checks the size of the list
	 * None
	 * Return Type - int - returns the number of items in the list
	 */
	public static int Size() {
		return guest.size();
	}//end size method
}//end RiderLine class