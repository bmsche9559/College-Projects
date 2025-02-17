/*
 * SortSearch.java - this file is a subclass of Csci1302_hw4 and contains the methods for the sorting and searching of the
 * Embedded file.
 * Author: Bradley Scheurich
 * Date completed: 4/9/2022
 */
package Unit_4;

public class SortSearch extends Csci1302_hw4{

	String rank, first_name, last_name;
	int years_served;

/*
 * this is the constructor method of the class and is responsible for creating the variables for a parent class
 * Formal Parameters:
 * s_rank(String): rank of the soldier
 * s_first_name(String): first name of the soldier
 * s_last_name(String): last name of the soldier
 * s_years_served(int): number of years soldier served
 * Return Type: none
 */
public SortSearch(String s_rank, String s_first_name, String s_last_name, int s_years_served) {
	this.rank = s_rank;
	this.first_name = s_first_name;
	this.last_name = s_last_name;
	this.years_served = s_years_served;
}//end constructor method
	
/*
 * this is the sorting method and is responsible for sorting the array of soldiers in alphabetical order
 * Formal Parameters:
 * soldier(Array) - this is the array of soldiers
 * Return Type - none
 */
public static void selectionSort (Soldier soldier[]) {
	int min;
	
	//Iterating through the array and sorting the rank of each soldier in alphabetical order
	for (int counter = 0; counter < soldier.length-1; counter++) {
		min = counter;
		for (int scan = counter+1; scan < soldier.length; scan++) {
			if (soldier[scan].rank.charAt(0) < soldier[min].rank.charAt(0)) {
				Soldier temp = soldier[scan];
				soldier[scan] = soldier[min];
				soldier[min] = temp;
			}//end if statement
			if (soldier[scan].rank.charAt(0) == soldier[min].rank.charAt(0)) {
				if (soldier[scan].rank.charAt(1) < soldier[min].rank.charAt(1)) {
					Soldier temp2 = soldier[scan];
					soldier[scan] = soldier[min];
					soldier[min] = temp2;
				}//end if statement
				if (soldier[scan].rank.charAt(1) == soldier[min].rank.charAt(1)) {
					if (soldier[scan].rank.charAt(2) < soldier[min].rank.charAt(2)) {
						Soldier temp3 = soldier[scan];
						soldier[scan] = soldier[min];
						soldier[min] = temp3;
					}//end if statement
				}//end if statement
			}//end if statement
		}//end for loop
	}//end for loop
	
	//after sorting the array by rank, going back through and sorting by soldiers last name
	for (int counter = 0; counter < soldier.length-1; counter++) {
		min = counter;
		for (int scan = counter+1; scan < soldier.length; scan++) {
			if (soldier[min].rank.charAt(0) == soldier[scan].rank.charAt(0) && soldier[min].rank.charAt(1) == soldier[scan].rank.charAt(1)) {
				if (soldier[min].rank.charAt(1) == soldier[scan].rank.charAt(1) && soldier[min].rank.charAt(2) == soldier[scan].rank.charAt(2)) { 
					if (soldier[scan].last_name.charAt(0) < soldier[min].last_name.charAt(0)) {
						Soldier temp = soldier[scan];
						soldier[scan] = soldier[min];
						soldier[min] = temp;
					}//end if statement
				}//end if statement
			}//end if statement
		}//end for loop
	}//end for loop
}//end selectionSort method

/*
 * this is the search method and is responsible for searching the array for a specific soldier
 * Formal Parameters:
 * soldier(Array) - the array of soldiers
 * Return type - none
 */
public static void binarySearch (Soldier soldier[]) {
	Soldier target = new Soldier("Corporal", "Meg", "Merwin", 3);
	int index = 0;
	boolean found = false;
	
	int min = 0;
	int max = soldier.length - 1;
	int mid = max / 2;
	
	//searches the sorted array by using a binary search
	while (!found && min <= max) {
		mid = (min+max)/2;
		if (soldier[mid].rank.equals("Corporal")) {
			if (soldier[mid].last_name.equals("Merwin")) {
				index = mid + 1;
				target = soldier[mid];
				found = true;
			}//end if statement
			else {
				mid--;
			}//end else statement
			index = mid + 1;
			target = soldier[mid];
			found = true;
		}//end if statement
		else if (soldier[mid].rank.charAt(0) > 'C') {
			max = mid - 1;
		}//end else if statement
		else {
			min = mid + 1;
		}//end else statement
	}//end while loop
	
	//if soldier is found it will print where they are located and all of their information, otherwise will print soldier not found.
	if (!found) {
		System.out.println("That soldier cannot be found at the base.");
	}//end if statement
	else {
		System.out.println("The soldier was found at position " + index + ", and the soldier is " + target);
	}//end else statement
}//end binarySearch method
}//end SortSearch class