/*
 * Csci1302_hw5.java - this file contains the main functionality of the program.
 * Author - Bradley Scheurich
 * Date of Completion - 4/29/22
 */
package hw5;

import java.util.Random;

public class Csci1302_hw5 {

	protected final static int CYCLES = 8;
	protected final static int MAX_NUM_RIDERS = 300;
	protected final static int MAX_WAIT_TIME = 20;
	protected final static int NUM_FIRST_NAMES = 30;
	static String[] first_names = {"John", "Brad", "Anthony", "Alex", "Grayson", "Tj", "Sydney", "Isabella", "Ashley", "Joseph",
			"Johnny", "Christine", "Levi", "Paul", "Jackson", "Jason", "Taylor", "Johnson", "Georgia", "Hallie", "Haley", "Robin",
			"Peter", "Chris", "Randy", "Roman", "Elizabeth", "Dwayne", "Will", "Madison"};

public static void main (String args[]) {
	
	int numRid = 0, totalWait = 0, numExit = 0, waitTime = 0, currentRider = 0, newCurrentRider = 0;
	int hourStart = 10, hourEnd = 11;
	String currentPerson;
	String newRider;
	String hourString = "am";
	
	Random gen = new Random();
	
	//initial for loop for each hour of the day
	for (int counter = 1; counter <= CYCLES; counter++) {
		//changes the hours from morning to afternoon
		if (hourStart > 12) {
			hourStart = 1;
			hourString = "pm";
		}
		if (hourEnd > 12) {
			hourEnd = 1;
		}
		System.out.println("Cycle# " + counter + "- " + hourStart + "" + hourString + " - " + hourEnd + "" + hourString + "----------------");
		//randomly determines the number of riders added and removed
		numRid = gen.nextInt(MAX_NUM_RIDERS);
		numExit = gen.nextInt(MAX_NUM_RIDERS);
		hourStart++;
		hourEnd++;
		//for loop for adding the riders to the list
		for (int counter2 = 0; counter2 <= numRid; counter2++) {
			currentRider++;
			newRider = first_names[gen.nextInt(NUM_FIRST_NAMES)];
			RiderLine.Add(newRider);
			System.out.println("Rider# " + currentRider + ": " + newRider + " has entered the queue.");
		}//end for loop
		//for loop for removing riders from the list
		for (int counter3 = 0; counter3 <= numExit; counter3++) {
			if (RiderLine.Empty() == true) {
				System.out.println("The queue is currently empty");
			}//end if statement
			else {
				newCurrentRider++;
				waitTime = gen.nextInt(MAX_WAIT_TIME);
				totalWait += waitTime;
				currentPerson = RiderLine.Remove();
				System.out.println("Rider# " + newCurrentRider + ": " + currentPerson + " has entered the ride after " + waitTime + " minutes.");
			}//end else statement
		}//end for loop
	}//end for loop
	
	//after the park is closed, a while loop to empty the list and let riders ride
	System.out.println("\nThe park is currently closed.\n");
	while (RiderLine.Empty() == false) {
		newCurrentRider++;
		waitTime = gen.nextInt(MAX_WAIT_TIME);
		currentPerson = RiderLine.Remove();
		System.out.println("Rider# " + newCurrentRider + ": " + currentPerson + " has entered the ride after " + waitTime + " minutes.");
	}//end while loop
	
	//prints the total riders and average wait time
	System.out.println("\nThe total number of riders today was: " + newCurrentRider);
	System.out.println("The average wait time was: " + totalWait / newCurrentRider + " minutes");
}//end main method
}//end Csci1302_hw5 class