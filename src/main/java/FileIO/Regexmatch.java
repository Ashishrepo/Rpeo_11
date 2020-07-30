package FileIO;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexmatch {
 
	public static Pattern p;
	public static Matcher m;
	public static void main(String[] args) {
		
		String[] numbers= {"918989857465","90909090338388","7000622103"};
		
		String pattern= "(0|91)?[0-9]{10}";
		
		 p = Pattern.compile(pattern);
		
		for(String n:numbers) {
			 m = p.matcher(n);
			if(m.find()&&m.group().equals(n)) {
				System.out.println("Valid Mobile number");
			}
			else {
				System.out.println("Invalid mObile number");
			}
		}
		
		
		String []emailid= {"ashish.jain@siemens-healthineers.com"," ashishjainjbp2011@gmail.com"};
		
		String pattern1= "[a-zA-z0-9][a-zA-z0-9[.]_]*@[a-zA-z]+-?[a-zA-z]*([.][a-zA-z]+)+";
		
		for(String e :emailid) {
			
			p=Pattern.compile(pattern1);
			 m=p.matcher(e);
			 
			 if(m.find()&&m.group().equals(e)) {
				 System.out.println("Valid mail ID");
			 }
			 else {
				 System.out.println("Invalid Mail id");
			 }
		}
		
		
		String name="1234Ashish5678";
		String alp="[0-9]+";
		p=Pattern.compile(alp);
		
		m=p.matcher(name);
		if(m.find()) {
			System.out.println(m.group());
		}else {
			System.out.println("No Match");
		}

	}

}
