package Basic_2_NS_and_DT;

public class DT_1 {
	public static void main(String[] args) {
		 byte b=10;
		 short sh=20;
		 int in=40;
		 long ln=50;
		 
//		 b = sh;  // although data(literal) is same, but they have different definition in memory and size
//		 b=in;
//		 b=ln;
		 
//		 sh=in;   // Implicit conversion
//		 sh=ln;
		 sh=b;
		 System.out.println(sh);
		 
		 in= b;
		 in=sh;
//		 in=ln;
		 System.out.println(in);
		 
		 ln=b;
		 ln=sh;
		 ln=in;
		 System.out.println(ln);
	}

}
