package Section6_RECURSION;
import java.util.Scanner;

public class factorial_3 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int N = in.nextInt();
	System.out.print("Factorial-> " + Factorial(N) );
}
public static int Factorial(int N) {
	if(N <= 1)
		return 1;
	return N * Factorial(N - 1);	
}
}
