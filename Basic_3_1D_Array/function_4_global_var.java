package Basic_3_1D_Array;

public class function_4_global_var {
	public static int global = 200; // Global Variable ( HEAP MEMORY )

	public static void main(String[] args) {
		int local = 23;

		System.out.println(global);

		int sum = addition(local);
		System.out.println(sum);

	}

	public static int addition(int a) // a is different variable than local, it's just holding data of local ( Local
										// variable )
	{
		System.out.println(global); // NO fight between local and global variable yet

		int global = 400; // this is different global varibale, even name same ( STACK MEMORY )

		System.out.println("if u don't mention local/gloabal shows local: " + global);

		// fight started between local and global

		int add = a + global; // here local variable -> global
		System.out.println(add); // 23+400

		int gma = a + (function_4_global_var.global); // Global variable accessing-> "classname.var_name"
		System.out.println(gma); // 23 + 200

		return gma;
	}
}
