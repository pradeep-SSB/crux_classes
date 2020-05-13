package Basic_5_String_and_String_builder;

import java.lang.String; // String package
import java.util.Scanner;

public class Introduction { // String Immutable in java****
	public static void main(String[] args) {

// String Declaration
		char[] str = { 'h', 'e', 'l', 'l', 'o', 's', 't', 'r', 'i', 'n', 'g' };
		for (char ch : str)
		System.out.print(ch);

// 2
		String str2 = new String("\nWelcome to class");
		System.out.println(str2);

//3
		String str3 = "Let's Rock";
		System.out.println(str3);
	
// Taking User String input
		Scanner in = new Scanner(System.in);  // ******************************
		String str4 = in.nextLine();

// Printing
	System.out.println(str4);
	
	
// String Immutable in java
	str3 = "Today";  // new string created ( Memory { Intern pool } )
	System.out.println(str3);

	}

}
