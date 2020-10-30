package Section6_RECURSION;

import java.util.Scanner;

public class Odd_even_program_2 {
public static void main(String[] agrgs) {
	Scanner in = new Scanner(System.in);
	int n= in.nextInt();
	PD(n);
	in.close();	
}
public static void PD(int n) {
	if(n == 0)
		return ;
	if(n%2 != 0)
	 System.out.print(n + " ");	
	PD(n - 1);
	if(n%2 == 0)
		System.out.print(n + " ");
}
}
