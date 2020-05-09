package Basic_1;

import java.util.Scanner;

public class Loop_demo {
	public static void main(String[] args) {
		int j = 0;
		int counter = 1;

		Scanner ab = new Scanner(System.in);
		int n = ab.nextInt();
		ab.close(); // no leakage problem, if u wont use then also okk but 'warning'

		for (int i = 0; i < n; i++)
			System.out.println("for loop");

		while (++j < n) // one iteration lesser than i loop, because its pre-increment.
			System.out.println("While loop");

		// initilization already
		for (; counter < 4; counter++) {
			System.out.println("works");
		}
		
		/*
		 * for(;;) { System.out.println("Infinite Loop"); }
		 */

	}
}
