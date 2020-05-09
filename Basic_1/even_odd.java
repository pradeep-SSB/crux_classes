package Basic_1;            // Scanner is calss starts with CAPS letter.
import java.util.Scanner;   // chk order of package and imported class, u can't change it.  

public class even_odd {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		if (n % 2 == 0)
			System.out.println("Even");

		else
			System.out.println("Odd");
	}

}
