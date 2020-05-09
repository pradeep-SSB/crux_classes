package Basic_3_1D_Array;

public class function_5_Block_scope {
	public static void main(String[] args) {
		int a = 12;

		if (20 > 10)
		{
			int demo = 100;
			System.out.println(demo); // accessible only to it's block (if)
//			int a=12; condition: block variable should not be earlier declared
		}

// System.out.println(demo); // demo not accessible outside to it's block
	}
}
