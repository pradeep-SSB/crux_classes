package Basic_1;

import java.util.Scanner;
import java.lang.Math;

public class Prime_number {
	public static void main(String[] args) {
		boolean flag = true;

		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		input.close();

//for (int i = 2; i < N; i++)  OR  for(int i=2;i< Math.sqrt(N);i++)
		
		 int i=1;      
		while(++i < N) {
			if (N % i == 0) {
				System.out.println("Composite Number");
				flag = false;
				break;
			}
		}

	if(flag==true)System.out.println("Prime Number");
}

}
