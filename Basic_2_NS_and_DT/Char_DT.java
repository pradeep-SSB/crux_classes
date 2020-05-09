package Basic_2_NS_and_DT;

import java.util.Scanner;

public class Char_DT {
	public static void main(String[] args) {

		char ch = 'a';
		char cp = 99;
		char cl = 6400;

		System.out.println(cp);
//		char cp= cp+2;   // at compile it dont know the value inside cp, it might out of range
		cp = (char) (cp + 2); //explicit type casting
		int in = cp +2 ;

		System.out.println(ch + "\t" + cp + "\t" + cl + "\t" + cp + "\t" + in);

		// cp= 68000; // 68000 out of char range
		cp = ( char)68000 ;
		System.out.println(cp);
		

		
	}

}
