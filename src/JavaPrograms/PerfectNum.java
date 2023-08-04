package JavaPrograms;

public class PerfectNum {

	    public static void main(String[] args) {
	       
	    	System.out.println("Perfect numbers between 1 and 1000:");
	        for (int i = 1; i <= 1000; i++) {
	            if (isPerfect(i)) {
	                System.out.println(i);
	            }
	        }
	    }
	    public static boolean isPerfect(int num) {
	        int sum = 0;
	        
	        for (int i = 1; i <= num / 2; i++) {
	            if (num % i == 0) {
	                sum=sum+i; 
	            }
	        }
	        return sum == num;
	    }
	}
