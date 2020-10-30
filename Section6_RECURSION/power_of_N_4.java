package Section6_RECURSION;
import java.util.Scanner;
public class power_of_N_4 {	// N ^ x
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int power  = in.nextInt();
		System.out.print("Value-> " + Power(N,  power) );
	}
public static int Power(int N, int x) {
	if(x == 0)
		return 1;
	int fn = Power(N, x-1);
	int fnm = N * fn;
	return fnm;	
}
}                  