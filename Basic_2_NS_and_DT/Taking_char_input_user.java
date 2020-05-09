package Basic_2_NS_and_DT;

import java.util.Scanner;

public class Taking_char_input_user {
public static void main(String[] args) {
	

//	char al =a; // treat a as variable either defined a as character  
	char cp ='a';
	
//	PART-2  Taking Character as input from user

	Scanner input = new Scanner(System.in);
	char zz= input.next().charAt(0); // next()- used to take String as input
	System.out.println(zz);
/* try input -
	 a -> a
	 4 -> 4
	abc-> a
	z bc->z
	856 ->8
*/
	
}
}
