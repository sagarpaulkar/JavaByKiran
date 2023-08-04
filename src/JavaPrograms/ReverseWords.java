package JavaPrograms;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the String: -");
		
		String str=sc.nextLine();
				
		 String[] words = str.split(" ");
		 
		 StringBuilder  result=new StringBuilder();
		 
		 for(int i=words.length-1;i>=0;i--)
		 {
			 result.append(words[i]).append(" ");			
		 }
		 System.out.println(result);
	}

}
