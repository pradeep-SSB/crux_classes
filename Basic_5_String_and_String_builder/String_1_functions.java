package Basic_5_String_and_String_builder;
import java.lang.*;
import java.util.Scanner;

public class String_1_functions {
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		String str1 = in.nextLine();
		
		String str= "PRADEEP";
//1 str.length();	
		System.out.println(str.length());
		System.out.println(str.length()-1); // acts like array index
		
//2 str.charAt(index)
		System.out.println(str.charAt(0) );
		System.out.println(str.charAt(str.length()-1));
	
//3 str.substing( Ci, Ei ) --> Ci- included & Ei --> excluded ********* 
		
		System.out.println(str.substring(0,3));
		System.out.println(str.substring(2 , 6));
		System.out.println(str.substring(4, 4));   // Null
		System.out.println(str.substring(2, 7));
//		System.out.println(str.substring(2, 8));   // Array index out of bound
		
//4 str.substring(Ci) --> Ci - starting index to end 
		System.out.println(str.substring(0) );
		System.out.println(str.substring(2) );
		
		
//5 Cocatenation
		String str1="MAHATO";
		// System.out.println( str + " " + str1); // not concatnation
		
			String str2 = str + str1;			//1		or String str2 = str + " " + str1;	
			String str3 = str.concat(str1) ;	//2	
		
		System.out.println( str2 );
		System.out.println( str3 );
	
//		== and Equals
		
		String S1 = "Hello"; // S1,S2,S3 ININTERN POOL	inside heap
		String S2 = S1;
		String S3 = "Hello";
		String S4 = new String("Hello"); // In heap, not in Intern pool
		
		System.out.println( ( S1==S2 ) +"  "+ S1.equals(S2));  // () - mandatory
		System.out.println( ( S1==S3 ) +"  "+ S1.equals(S3));
		System.out.println( ( S1==S4 ) +"  "+ S1.equals(S4));
		
		
	
		
	
		
		
	
		
		
		
		
	}

}
