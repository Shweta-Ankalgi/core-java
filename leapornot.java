
//Write a program to check whether a given year is a leap year or not.
package java1;

import java.util.Scanner;

public class leapornot {
		
		public static void main(String[] args) {
			
			//checking the entered year leap year or not
			int year;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Year :");
			year = sc.nextInt();
			System.out.println("Entered Year is:" +year);
			
			// Checking the entered year is leap year or not
	        if (year % 400 == 0) {
	            System.out.println(year + " is a Leap Year.");
	        } 
	        
	        
	        else if (year % 100 == 0) {
	            System.out.println(year + " is not a Leap Year.");
	        } 
	        
	        
	        else if (year % 4 == 0) {
	            System.out.println(year + " is a Leap Year.");
	        } 
	        else {
	            System.out.println(year + " is not a Leap Year.");
	        }
	    }
			
			
	}


	/*
	Output 
	Enter Year :
	2000
	Entered Year is:2000
	2000 is a Leap Year.*/




