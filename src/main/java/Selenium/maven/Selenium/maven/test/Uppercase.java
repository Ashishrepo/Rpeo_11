package Selenium.maven.Selenium.maven.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Uppercase {

	public static void main(String[] args) {

		String g="selenium Interview series 13 for 56 begineers ayu13sh";
		//System.out.println(g.toUpperCase());

		char [] ch=g.toCharArray();

		//logic to print first letter of each word in Capital
		for(int i=1;i<g.length();i++) {

			if(Character.isLowerCase(ch[0])) {

				ch[0]=Character.toUpperCase(ch[0]);}

			if(ch[i]==' ') {
				if(Character.isLowerCase(ch[i+1])) {
					ch[i+1]=Character.toUpperCase(ch[i+1]);
				}


			}
			
		}
		//Pattern with matcher
		// [0-9]// or [//d+]
		Pattern pt =Pattern.compile("[0-9]+");
		Matcher mt= pt.matcher(g);
		while(mt.find()) {
			System.out.println(mt.group());
		}
		
		System.out.println("second");

       // only pattern
         Pattern pt1 = Pattern.compile("13");
         String[] splt = pt1.split(g);
         System.out.println(splt.length);
         
         System.out.println("Third");
         Pattern pt2= Pattern.compile("\\s");
         Matcher f = pt2.matcher(g);
         while(f.find()) {
        	 System.out.println(f.start()+"...."+f.group());
         }
        		 

	}
}
