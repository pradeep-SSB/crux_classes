package Basic_2_NS_and_DT;

public class Fahrenheit_to_celsius {
	public static void main(String[] args) {
		int cl = 0;
		float fl = 0;

		while (fl <= 300) {
			cl = (int) ((5 * (fl - 32)) / 9);  // cl= int( (5.0/9) * (fl -32) );
			System.out.println((int) fl + "\t" + cl);
			fl = fl + 20;
		}
	}
}
