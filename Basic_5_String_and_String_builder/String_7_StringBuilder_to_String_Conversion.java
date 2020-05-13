package Basic_5_String_and_String_builder;
import java.util.*;

public class String_7_StringBuilder_to_String_Conversion {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	StringBuilder sb= new StringBuilder("Hello");
	System.out.println(sb);
	String str = sb.toString(); //****
	System.out.println(str);
}
}
