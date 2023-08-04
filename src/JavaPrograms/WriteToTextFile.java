package JavaPrograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToTextFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String filePath = "C:\\Users\\Sagar Paulkar\\Desktop\\JavaCode.txt";
		
		FileWriter fw= new FileWriter(filePath);
		BufferedWriter bw= new BufferedWriter(fw);
		
		String data= "Hellow World";
		
		bw.write(data);
		bw.newLine();
		bw.close();
		System.out.println("Data written on the text file");
	}

}
