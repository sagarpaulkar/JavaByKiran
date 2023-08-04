package JavaPrograms;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		int number= sc.nextInt();
		
		boolean isPrime = false;
		
		for (int i = 2; i <= number-1; i++) {
			
			if (number % 2==0)
			{
				isPrime = false;
				break;
			}
			else {
				
				isPrime= true;
			}
		}
		if (isPrime) {
		System.out.println(number + " Prime Number");
		}
		else {
			System.out.println(number + " Not Prime number");
		}
	}

}
