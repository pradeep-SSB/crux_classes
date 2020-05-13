package Basic_5_String_and_String_builder;

import java.util.*;

public class String_6_String_builder {
	public static void main(String[] args) {

// Taking StringBuilder userInput
		Scanner in = new Scanner(System.in);
	    String str = in.nextLine(); 
	    StringBuilder SB = new StringBuilder(str);  // No direct way, use this
	    System.out.println(SB);
	    
		
		StringBuilder sb = new StringBuilder("Hello");
//Printing
		System.out.println(sb);
//		Length 
		System.out.println(sb.length());

//charAt
		System.out.println(sb.charAt(2));

//set.charAt or UPDATE
		sb.setCharAt(2, 'W');  // Replace  algo
		System.out.println(sb);
//		sb.setCharAt(sb.length(), 'Y' ); //******* run time error ( Index )
		
//sb.insert
		sb.insert(3, 'X');    //  insert + Shift : Algo
		System.out.println(sb);
		sb.insert(4, "bc");		// accept string too, but not charAt accept string only character
		System.out.println(sb);
		sb.insert(8, "end");	//*********
		sb.insert(sb.length(), "END"); //
		System.out.println(sb);  
//		sb.insert(12, "Z"); 	// run time error
		
		
//Append
		sb.append('A');
		System.out.println(sb);
		sb.append("ABC");
		System.out.println(sb);
		
// Delete
		sb.deleteCharAt(1);
		System.out.println(sb);
//		sb.deleteCharAt(sb.length()); // run time error ( Index )
		
		
		

	}

}
