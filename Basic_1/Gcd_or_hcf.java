package Basic_1;

import java.util.Scanner;

public class Gcd_or_hcf {
	public static void main(String[] args) {
		int rem = 0;

		Scanner input = new Scanner(System.in);
		int divisor = input.nextInt();
		int divident = input.nextInt();
		input.close();

		while (divident % divisor != 0) {  // chk notes for diagramatic explanation
			rem = divident % divisor;
			divident = divisor;
			divisor = rem;
		}
		System.out.println(divisor);

	}

}
