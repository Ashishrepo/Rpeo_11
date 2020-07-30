package FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class ReadWrite1 {


	public static void main(String[] args) throws Exception {
		
		// Make Dir if not exist
		File f= new File("D:\\FileIO");
		if(!f.exists()) {
		   f.mkdir();
		}
		
		//Add name to File1.txt
		String[] name= {"Ashish","Ayush","Yash","Varun","Utkarsh"};
		PrintWriter pw= new PrintWriter("D:\\FileIO\\file1.txt");
		for(String n:name) {
			pw.println(n);
		}
		
		//Add Company to File2.txt
		String [] company= {"null","TCS","TCS","Null"};
		PrintWriter pw1= new PrintWriter("D:\\FileIO\\file2.txt");
		for(String c:company) {
			pw1.println(c);
		}
		pw.close();
		pw1.close();
		
		//copy content from file1 to file3
		BufferedReader br= new BufferedReader(new FileReader("D:\\FileIO\\file1.txt"));
		PrintWriter pw3= new PrintWriter("D:\\FileIO\\file5.txt");
		
		String read= br.readLine();
		
		while(read!=null) {
			pw3.println(read);
			read=br.readLine();
		}
		//copy content from file2 to file3
		br= new BufferedReader(new FileReader("D:\\FileIO\\file2.txt"));
		read=br.readLine();
		while(read!=null) {
			
			pw3.println(read);
			read = br.readLine();
		}
		
		br.close();
		
     
		//Alternate
	 
		BufferedReader br11= new BufferedReader(new FileReader("D:\\FileIO\\file1.txt"));
		BufferedReader br22= new BufferedReader(new FileReader("D:\\FileIO\\file2.txt"));
		
		pw3.println("********* Alternate**********");
		String linebr11= br11.readLine();
		String linebr22=br22.readLine();
		while(linebr11!=null || linebr22!=null) {
			
			if(linebr11!=null) {
				pw3.println(linebr11);
				linebr11= br11.readLine();
			}
			
			if(linebr22!=null) {
				pw3.println(linebr22);
				linebr22=br22.readLine();
			
				
			}
			
			
		}
			
		pw3.flush();
		pw3.close();
	
	}
	


}
