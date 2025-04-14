package java1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		num=sc.nextInt();
		
		if(num <= 1)
		{
			System.out.println(num+" is not a prime number.");
			return;
		}
		
		for(int i=2;i<=num/2;i++)
		{
			if(num % i == 0)
			{
				count++;
			}
		}
		
		if(count >= 1)
		{
			System.out.println(num+" is not a Prime number.");
		}
		else
		{
			System.out.println(num+" is Prime number.");
		}

	}

}

/* OUTPUT
 * Enter a number :
 * 11
 * 11 is Prime number.
 */

