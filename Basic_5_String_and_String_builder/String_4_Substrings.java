package Basic_5_String_and_String_builder;
import java.util.*;

public class String_4_Substrings {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		for(int i=0; i< str.length();i++) {
			for(int j=i+1;j< str.length()+1;j++) {
			System.out.println(	str.substring(i, j) );
			}
		}
	}

}
