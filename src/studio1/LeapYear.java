package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Year?");	
		int year = in.nextInt() ;
		boolean leapYear1 = (year % 4 == 0) ;
		boolean leapYear2 = (year % 100 != 0) ;
		boolean leapYear3 = (year % 400 == 0) ;
		System.out.println(year + " is a leap year: ")  ;
		// |leapYear2||leapYear3)
		System.out.println((leapYear1 && leapYear2) || leapYear3) ;
		
		
		

	}

}
