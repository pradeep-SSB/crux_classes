package Basic_5_String_and_String_builder;
import java.util.*;
public class String_8_StringBuilder_Performance { //O(N)
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		StringBuilder sb = new StringBuilder(str);
		long start =System.currentTimeMillis();
		performanence(sb);   								// Passing Stringbuilder as argument
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		
	}
	public static void performanence( StringBuilder sb) {  // receiving Stringbuilder as parameter
    long n= 100000;
    for(long i=1; i<=n;i++) {
    	sb.append(i);   				 // Key not like previously : sb = sb + i; // error
    }
//		System.out.println(sb);
		
	}

}
