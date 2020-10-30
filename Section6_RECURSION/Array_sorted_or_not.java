package Section6_RECURSION;

import java.util.Scanner;

public class Array_sorted_or_not {
public static void main(String[] args ) {
	Scanner in = new Scanner(System.in);
//	int N = in.nextInt();
//	int[] arr = new int[N];
//	for(int i = 0; i < N; i++ ) {
//		arr[i] = in.nextInt();
//	}
	int[] arr = {10,20,30,40,200};
	System.out.print(Check_Array(arr, 0) );
}
public static boolean Check_Array(int[] arr, int Si) {
	if(Si == arr.length - 1) 
		return true;
	
	 if(arr[Si] < arr[Si + 1]) {
		 boolean ans = Check_Array(arr, Si + 1); // not works here: return Check_Array(arr, Si + 1);
		 System.out.println(Check_Array(arr, Si +1));
		 return ans;
	 } 
return false;
} 
} 
   