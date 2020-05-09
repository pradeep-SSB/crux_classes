package Basic_1;

import java.util.Scanner;

public class Reverse_number {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		long N = input.nextLong();
		input.close();
		int R_number = 0;

		while (N != 0) {
			int rem =(int)( N % 10 );
			R_number = R_number * 10 + rem;
			N = N / 10;
		}
		System.out.println(R_number);
	}
}
