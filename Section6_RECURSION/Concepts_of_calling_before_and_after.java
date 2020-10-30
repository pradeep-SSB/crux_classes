package Section6_RECURSION;

import java.util.Scanner;

public class Concepts_of_calling_before_and_after {
	public static void main(String[]  args) {
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		System.out.println("Output");
//		PD(input);
		PI(input);		
	}
	public static void PD(int X) {
		if(X == 0)
			return ;
		PD(X - 1);
		System.out.println(X);		//
	}
	public static void PI(int X) {
		if(X == 0)
			return ;
		PI(X - 1);
		System.out.println(X);	//
	}
}
