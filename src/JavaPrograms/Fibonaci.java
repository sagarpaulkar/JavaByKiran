
package JavaPrograms;

public class Fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0, b=1, c=0;
		
		for(int i=0;i<=10;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c+" ");
		
		}
		
	}

}
