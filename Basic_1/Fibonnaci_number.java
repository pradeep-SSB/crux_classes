package Basic_1;

import java.util.Scanner;

public class Fibonnaci_number {
	public static void main(String[] args) {
		int a = 0, b = 1;

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int i = 0, sum = 0;

		while (i++ < n) {
			System.out.print(a + " ");// key printing a
			sum = a + b;
			a = b;
			b = sum;
		}

	}
}
