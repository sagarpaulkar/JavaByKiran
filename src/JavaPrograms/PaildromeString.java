
package JavaPrograms;

import java.util.Scanner;

public class PaildromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the String?");
		String original = sc.nextLine();
		String reverse = "";
		int length= original.length();
		
		for(int i=length-1;i>=0;i--) {
			
			reverse=reverse+original.charAt(i);
			
		}
		if(original.equals(reverse)) {
				System.out.println("Palidrome");
			}
			else {
				System.out.println("Not Palidrome");
			}
		}
		
		
	}

