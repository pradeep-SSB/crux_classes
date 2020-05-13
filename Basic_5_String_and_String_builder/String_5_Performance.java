package Basic_5_String_and_String_builder;

import java.util.*;

public class String_5_Performance {  // immutable disadcantages in this case
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		String str = in.nextLine();

		long start = System.currentTimeMillis();
		performanence();
		long end = System.currentTimeMillis();

		System.out.println(end - start); // note time it's too much
}

	public static void performanence() {
		long n = 100000; 
		String S = "";
		for (long i = 0; i < n; i++) { // looks O(n) but tooks O(n*n)
			S += i;
		}
	}

}
