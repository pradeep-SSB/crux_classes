package Basic_1;

public class if_else {

	public static void main(String[] args) {
		int a = 30;

		if (a > 100)
			System.out.println("OLD");
		else {
			if (a < 20)
				System.out.println("Adult");

			else if (a >= 20 && a < 30)
				System.out.println("Young");

			else {
				System.out.println("Employee");
			}
		}
	}
}
