package FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class Mergedatafromfilesintoonefile {

	public static void main(String[] args) throws Exception {
		
		
		File f= new File("D:\\Files");
		PrintWriter pw = new PrintWriter("D:\\copy.txt");
		String[] files=f.list();
		for(String fl:files) {
			
			File fc= new File(f,fl);
			BufferedReader br = new BufferedReader(new FileReader(fc)); // or we can use ("D:\\Files\\"+fl)
			String content = br.readLine();
			while(content!=null) {
				pw.println(content);
				content=br.readLine();
			}
			
			
		}
		pw.close();
		
		

	}

}
