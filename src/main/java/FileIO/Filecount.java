package FileIO;

import java.io.File;

public class Filecount {

	public static void main(String[] args) {
		
		// Count and name of files and directory inside a Dir
		File f= new File("C:\\");
		String[] names = f.list();
		System.out.println(names.length);
		
//		for(String n:names) {
//			System.out.println(n);
//		}
		
		
		System.out.println("Count");
		//Count and print only files and not Dir
		int filecount=0, dircount=0;
		
		for(String n1:names) {
			
			File f1 = new File(f,n1);
			if(f1.isFile()) {
				filecount++;
				System.out.println("File: "+n1);
			}
			
			else {
				
				dircount++;
				System.out.println("Dir: "+n1);
			}
			
			
				
				
			
		}
		System.out.println("Total number of Files are: "+filecount);
		System.out.println("Total number of Files are: "+dircount);

	}

}
