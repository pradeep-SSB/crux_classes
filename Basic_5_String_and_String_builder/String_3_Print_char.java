package Basic_5_String_and_String_builder;
import java.util.*;

public class String_3_Print_char {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str= in.nextLine();
		
		for(int i=0;i< str.length();i++) {
			System.out.println(str.charAt(i));
		}
	}

}
