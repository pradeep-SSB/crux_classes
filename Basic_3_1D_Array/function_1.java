package Basic_3_1D_Array;

import java.util.Scanner;

public class function_1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		long a = input.nextLong();
		long b = input.nextLong();
		input.close();
		System.out.println("Hello Amazon");

//	 Function Calling
		function(a, b);
		
		
		System.out.println("Coming");}
	

//	Function Definition : "public static" lik do + return type + function name + ( Pass parameter)as per calling DT
	public static void function(long l, long b) {
		
		
		long area = 2 * (l + b);
		System.out.println(area);
	}

}
