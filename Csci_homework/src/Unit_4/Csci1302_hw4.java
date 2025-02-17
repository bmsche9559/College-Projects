/*
 * Csci1032_hw4.java - this program is the driver class of assignment 4 and reads in a list of soldiers on an army base and
 * sorts them in alphabetical order and finds a specific soldier.
 * Author: Bradley Scheurich
 * Date Completed: 4/9/2022
 */
package Unit_4;

import java.io.*;
import java.util.Scanner;

public class Csci1302_hw4 {

public static void main (String args[]) throws IOException {
	
	String rank, first_name, last_name;
	int years_served, soldier_count = 0;
	
	//this while loop counts how many soldiers are in the file
	Scanner scnr = new Scanner(new File("FtBenning.txt"));
	while (scnr.hasNextLine()) {
		soldier_count++;
		scnr.nextLine();
	}//end while loop
	
	Soldier[] soldier = new Soldier[soldier_count];
	
	//this for loop populates the soldier array with each line of information in the file
	Scanner filescan = new Scanner (new File("FtBenning.txt"));
	filescan.useDelimiter(",|\n");
	for (int counter = 0; counter < soldier_count; counter++) {
		rank = filescan.next();
		first_name = filescan.next();
		last_name = filescan.next();
		filescan.skip(",");
		years_served = Integer.parseInt(filescan.nextLine());
		soldier[counter] = new Soldier (rank, first_name, last_name, years_served);
	}//end while loop
	
	//prints the array after populating it
	for (int counter = 0; counter < soldier_count; counter++) {
		System.out.println(soldier[counter]);
	}//end for loop
	
	System.out.println("\n" + "-------------------After Sorting------------------------" + "\n");
	
	//calls the sorting method in the SortSearch class
	SortSearch.selectionSort(soldier);
	
	//prints array after sorting
	for (int counter = 0; counter < soldier_count; counter++) {
		System.out.println(soldier[counter]);
	}//end for loop
	
	System.out.println("\n" + "-------------------After Searching------------------------" + "\n");
	
	//calls the search method in SortSearch class
	SortSearch.binarySearch(soldier);
}//end main method
}//end Csci1302_hw4 class
