package FileIO;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;  
public class Regexmatch1 {

	public static void main(String[] args) throws Exception {

		//Read
		BufferedReader br = new BufferedReader(new FileReader("D:\\PrintReader.txt"));
		String line = br.readLine();

		//Write
		PrintWriter wrt = new PrintWriter(new File("D:\\Printwrter.txt"));

		Pattern p = Pattern.compile("(0|91)?[0-9]{10}");
		while(line!=null) {

			Matcher mt =p.matcher(line);
			while(mt.find()) {

				wrt.println(mt.group());

			}
			line=br.readLine();
		}
		wrt.flush();



    //Display of text file in a Directory
		
		Pattern p1= Pattern.compile("[a-zA-z0-9]+[.]txt");
		File f1 = new File("C:\\");
		String[] lst = f1.list();
		
		for(String l:lst) {
			Matcher m1 = p1.matcher(l);
			if(m1.find()) {
				
				System.out.println(m1.group());
			}
		}

	}

}
