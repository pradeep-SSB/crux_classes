package Basic_5_String_and_String_builder;
import java.util.*;

public class String_2_Equals_and_Equal_operator {
public static void main(String[] args) {
	
//	== and Equals
	
	String S1 = "Hello"; // S1,S2,S3 ININTERN POOL	inside heap
	String S2 = S1;
	String S3 = "Hello";
	String S4 = new String("Hello"); // In heap, not in Intern pool
	
	System.out.println( ( S1==S2 ) +"  "+ S1.equals(S2));  // () - mandatory
	System.out.println( ( S1==S3 ) +"  "+ S1.equals(S3));
	System.out.println( ( S1==S4 ) +"  "+ S1.equals(S4));
}
}

// Never ever used " == " in string problems to compare string
// S1.equals(S4) --> Compare character by character data to strings