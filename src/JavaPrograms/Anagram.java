package JavaPrograms;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1="Army";
		
		String str2="Mary";
		
		char[] arr= str1.toLowerCase().toCharArray();
		char[] arr2= str2.toLowerCase().toCharArray();
		
		
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		if (Arrays.equals(arr, arr2)) {
			
			System.out.println("Anagrams");
			
		}else {
			System.out.println("Not Anagrams");
		}
		
		
	}

}
