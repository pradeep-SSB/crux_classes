package Basic_3_1D_Array;

public class function_3_local_var {
	public static void main(String[] args) {

		int a = 22;
		int b = 1212;

		int sum = summo(a, b); // local variable, having limited scope to it's method(main) only ( STACK MEMORY
								// )
		System.out.println("main: " + sum);

	}

	public static int summo(int x, int y) // here x, y are different local variable having scope to ir's method summo,
											// they are just holding values of a, b
//( also in STACK memory)
	{

		int add = x + y;
		System.out.println("summo: " + add);
		return add + 1; // sum ad add different variables

	}

}
