package Unit_3;
/*
 * Csci1302_hw3.java - This program is the driver program for the subclasses.
 * Author: Bradley Scheurich
 * Date Created: 3/11/2022
 */
public class Csci1302_hw3 {

public static void main (String args[]) {
	
	Team_sports tsports1 = new Team_sports ("Red Socks", 22);
	Baseball baseball1 = new Baseball ("Red Socks", 22, 15, 20);
	Team_sports tsports2 = new Team_sports ("White Socks", 21);
	Baseball baseball2 = new Baseball ("White Socks", 21, 30, 18);
	Team_sports tsports3 = new Team_sports ("Yellow Socks", 25);
	Baseball baseball3 = new Baseball ("Yellow Socks", 25, 22, 19);
	
	Team_sports tsports4 = new Team_sports ("Atlanta Hawks", 15);
	Basketball basketball1 = new Basketball ("Atlanta Hawks", 15, 82, 3000);
	Team_sports tsports5 = new Team_sports ("Washington Wizards", 13);
	Basketball basketball2 = new Basketball ("Washington Wizards", 13, 82, 2247);
	Team_sports tsports6 = new Team_sports ("Miami Heat", 12);
	Basketball basketball3 = new Basketball ("Miami Heat", 12, 82, 2995);
	
	Team_sports tsports7 = new Team_sports ("Seattle Seahwaks", 48);
	Football football1 = new Football ("Seattle Seahawks", 48, 3, 5, 10, 20, 30);
	Team_sports tsports8 = new Team_sports ("Denver Broncos", 49);
	Football football2 = new Football ("Denver Broncos", 49, 6, 8, 2, 23, 25);
	Team_sports tsports9 = new Team_sports ("Buffalo Bills", 39);
	Football football3 = new Football ("Buffalo Bills", 39, 1, 4, 8, 20, 28);
	
	Team_sports tsports10 = new Team_sports ("King Power Foxes", 4);
	Horse_polo hpolo1 = new Horse_polo ("King Power Foxes", 4, "purple", 15, 22);
	Team_sports tsports11 = new Team_sports ("Dubai", 5);
	Horse_polo hpolo2 = new Horse_polo ("Dubai", 5, "red", 19, 23);
	Team_sports tsports12 = new Team_sports ("HB Polo", 5);
	Horse_polo hpolo3 = new Horse_polo ("HB Polo", 5, "green", 10, 20);
	
	Individual_sports isports1 = new Individual_sports ("John Stewart", 31, "6'1''", 210);
	Horse_barrel_racing hbr1 = new Horse_barrel_racing ("John Stewart", 31, "6'1''", 210, 3.31, 9.45);
	Individual_sports isports2 = new Individual_sports ("Jessica Roberts", 22, "4'9''", 189);
	Horse_barrel_racing hbr2 = new Horse_barrel_racing ("Jessica Roberts", 22, "4'9''", 189, 2.99, 12.12);
	Individual_sports isports3 = new Individual_sports ("Sydney Adams", 19, "5'8''", 195);
	Horse_barrel_racing hbr3 = new Horse_barrel_racing ("Sydney Adams", 19, "5'8''", 195, 2.95, 10.34);
	
	Individual_sports isports4 = new Individual_sports ("John Regal", 31, "6'6''", 230);
	Motocross m1 = new Motocross ("John Regal", 31, "6'6''", 230, 10);
	Individual_sports isports5 = new Individual_sports ("Brock Lesnar", 29, "6'0''", 195);
	Motocross m2 = new Motocross ("Brock Lesnar", 29, "6'0''", 195, 14);
	Individual_sports isports6 = new Individual_sports ("Jackson Jones", 22, "5'8", 200);
	Motocross m3 = new Motocross ("jackson Jones", 22, "5'8''", 200, 12);
	
	Individual_sports isports7 = new Individual_sports ("John Adams", 28, "6'1''", 195);
	Tennis t1 = new Tennis ("John Adams", 28, "6'1''", 195, 20);
	Individual_sports isports8 = new Individual_sports ("Terry Crews", 25, "6'0''", 187);
	Tennis t2 = new Tennis ("Terry Crews", 25, "6'0''", 187, 22);
	Individual_sports isports9 = new Individual_sports ("Berry Alex", 22, "5'8", 196);
	Tennis t3 = new Tennis ("Berry Alex", 22, "5'8''", 196, 12);
	
	System.out.print(tsports1);
	System.out.println(baseball1);
	System.out.print(tsports2);
	System.out.println(baseball2);
	System.out.print(tsports3);
	System.out.println(baseball3);
	System.out.println();
	
	System.out.print(tsports4);
	System.out.println(basketball1);
	System.out.print(tsports5);
	System.out.println(basketball2);
	System.out.print(tsports6);
	System.out.println(basketball3);
	System.out.println();
	
	System.out.print(tsports7);
	System.out.println(football1);
	System.out.print(tsports8);
	System.out.println(football2);
	System.out.print(tsports9);
	System.out.println(football3);
	System.out.println();
	
	System.out.print(tsports10);
	System.out.println(hpolo1);
	System.out.print(tsports11);
	System.out.println(hpolo2);
	System.out.print(tsports12);
	System.out.println(hpolo3);
	System.out.println();
	
	System.out.print(isports1);
	System.out.println(hbr1);
	System.out.print(isports2);
	System.out.println(hbr2);
	System.out.print(isports3);
	System.out.println(hbr3);
	System.out.println();
	
	System.out.print(isports4);
	System.out.println(m1);
	System.out.print(isports5);
	System.out.println(m2);
	System.out.print(isports6);
	System.out.println(m3);
	System.out.println();
	
	System.out.print(isports7);
	System.out.println(t1);
	System.out.print(isports8);
	System.out.println(t2);
	System.out.print(isports9);
	System.out.println(t3);
	System.out.println();
}//end main class
}//end Csci1302_hw3 class
