package Basic_3_1D_Array;

public class function_2 {
	public static void main(String[] args) {
		int a = 12;
		int b = 3;

		int mul = multi(a, b); // capt the value of  function return 
		
		
		
		System.out.println(mul);
	}

	public static int multi(int l, int b) {
		int sum = l * b;
		return sum; // return l*b;
	}
}
