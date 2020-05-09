package Basic_1;

import java.util.Scanner;

public class Sum_N_number {
	public static void main(String arg[]) {
		int i = 0, sum = 0;

		Scanner input = new Scanner(System.in);
		int N = input.nextInt();

		while (i++ < N)
			sum += i; // 1 line code runs okkk, within while


		System.out.print(sum);
	}
}