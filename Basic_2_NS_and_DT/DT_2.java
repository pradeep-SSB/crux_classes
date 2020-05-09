package Basic_2_NS_and_DT;

public class DT_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Part-1 Byte DT
		byte b = 127; // implicit conversion
		byte c = -128; // even it's not in range -127 to 127, thia one extra 2*n +1
		
		// byte s= 128; // can't convert int to byte
		byte s=  ( byte )128;  // explicit conversion

		System.out.println(b);
		System.out.println(c);
		System.out.println(s);// check output

//       Pat-3  Integer DT

		long ln = 1000000000;
		// long sn= 10000000000; // even number 10000000000 in long range, bt not
		// accepting bcoz by default literals are integer

		long fn = 10000000000L; // now number 10000000000 is of long type
		System.out.println(ln + "\t" + fn);

//		 Part-4 Decimal( by default double) DT

		// float f= 5.50; // can not convert double to float, bcoz by default decimal
		// value by default is double
		float fd = (float) 5.50; // explicit conversion
		float f = 5.50f; // also works

		System.out.println(fd + "\t" + f);
		
//		Part-5
		int a =10;
		float z = 35.54f;
		a = (int)z  ; // ignore the value after decimal point
		System.out.println(a);
		
//		Part-6  Boolean DT
		
		boolean bb= true;
		boolean cc= false;
//		boolean dd =1; not like C/C++ 0/1 doesn't allow
				
	}

}
