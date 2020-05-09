package Basic_3_1D_Array;

public class function_6_pass_by_value {
	public static void main(String[] args) {
		int a = 10;
		int b = 12;

		System.out.println(a + " " + b);
		addition(a, b);

		System.out.println(a + " " + b); // NO effect
	}

	public static void addition(int a, int b) {
		System.out.println(a + " " + b);

		int temp = b;
		b = a;
		a = temp;

		System.out.println("In addition method: " + a + " " + b); // changes reflects only here
	}

}
