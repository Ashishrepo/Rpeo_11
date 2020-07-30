package FileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class RemoveDuplicates {
	
	public static void main(String[] args) throws Exception {
		
		PrintWriter pw = new PrintWriter("D:\\NoDuplicates.txt");
		boolean available =false;
		BufferedReader br1 = new BufferedReader(new FileReader("D:\\Duplicates.txt"));
		String line = br1.readLine();
		
		while(line!=null) {
			
			System.out.println(line);
			BufferedReader br2= new BufferedReader(new FileReader("D:\\NoDuplicates.txt"));
			String target= br2.readLine();
			while(target!=null) {
				
				if(line.equals(target)) {
					available=true;
					break;
				}
				
				target=br2.readLine();
			}
			
			if(available==false) {
				pw.println(line);
				pw.flush();
				
			}
			
			
			line=br1.readLine();
			System.out.println("after: "+line);
		}
		
		
		
		
	
		
	}

}
