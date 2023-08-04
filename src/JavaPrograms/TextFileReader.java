package JavaPrograms;

import java.io.BufferedReader;

import java.io.FileReader;


public class TextFileReader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String filePath="C:\\Users\\Sagar Paulkar\\Desktop\\OPEN EMR.txt";
		
		FileReader fileReader= new FileReader(filePath);
	    BufferedReader br= new BufferedReader(fileReader);
	    
	    String line;
	    while((line = br.readLine()) != null) {
	    	System.out.println(line);
	    }
		
	}

}
