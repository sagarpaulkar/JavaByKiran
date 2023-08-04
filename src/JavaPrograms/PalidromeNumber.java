package JavaPrograms;

import java.util.Scanner;

public class PalidromeNumber {
	
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);

	System.out.println("please enter the number? ");
	
	int num =sc.nextInt();
	
	System.out.println(num);
	int rev;
	int temp;
	int sum = 0;
	temp=num;
	
	while (num>0) {
		
		rev=num%10;
		sum= sum * 10+rev;
		num=num/10;
	}
	if(temp==sum) {
		System.out.println("palidrome");
	}else 
	{
		System.out.println("Not Palidrome");
	}
}
}
