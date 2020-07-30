package FileIO;

import java.io.File;

public class Filecreate {
	
	public static void main(String[] args) throws Exception {
		
		// New File in the Current Working Directory----Constructor1
		File f= new File("file1.txt");
		f.createNewFile();
		// New Dir in the Current Working Directory
		File f1= new File("Dir1");
		f1.mkdir();
		
		//Create file in a specific directory in Current working Directory---(Constructor 2)
		File f3= new File(f1,"filedir1.txt");
		f3.createNewFile();
		
		// Create file in other existing Dir
		File f4 = new File("C:\\30","filenewdir1.txt");
		if(!f4.exists()) {
			f4.createNewFile();
		}
		
		
		//
		File f5 = new File("C:\\DurgaSoft");
		if(!f5.exists()) {
			
			f5.mkdir();
			
		}
		
		
		
	}

}
