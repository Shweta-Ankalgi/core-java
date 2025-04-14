//.Write java program to check candidate is eligible for voting or not using if -else statement.

package java1;

import java.util.Scanner;

public class voteEligible {
	
	public static void main(String[] args) {
		
		//checking the entered age is eligible  to vote or not
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year :");
		age = sc.nextInt();
		System.out.println("Entered Year is:" +age);
		
		//checking the entered age is eligible to vote or not.
		if(age >= 18) {
			System.out.println("You are eligible to vote.");
			
		}
		else {
			System.out.println("you are not eligible to vote.");
		}
	}

}

/* OUTPUT
Enter Year :
30
Entered Year is:30
You are eligible to vote.*/

