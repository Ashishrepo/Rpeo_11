package FileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferedreadwrite {

	public static void main(String[] args) throws IOException {

      // Write into a file
		
		String[] a= {"Ashish","Ayush","Yash","Varun"};
		char[] h= {'z','x','t','b'};
		BufferedWriter br = new BufferedWriter(new FileWriter("D:\\abc.txt",true));
		
		for(String a1:a) {
			
			br.write(a1);
			br.newLine();
			
			
		}
		//can write char arrays value directly
		br.write(h);
		br.close();
		
		BufferedReader brw = new BufferedReader(new FileReader("D:\\abc.txt"));
		String ln =brw.readLine();
		while(ln!=null) {
			System.out.println(ln);
			
			ln=brw.readLine();
					}
		
		brw.close();
		

	}

}
