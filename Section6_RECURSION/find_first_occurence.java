package Section6_RECURSION;

import java.util.Scanner;

public class find_first_occurence {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int element =  in.nextInt(); 
		int[] arr = {1,2,3,4,5,9,7,8,9,45,34};
//		System.out.println(Find_element(arr, element,0 ));
		getNthFib(5);
	}
	public static int Find_element(int[] arr, int el, int Si) {
		if(Si == arr.length)
			return -1;
		if(arr[Si] ==  el)
			return Si; 
		if(Si !=  arr.length) {
			int position= Find_element(arr, el, Si + 1);
			return position; 
		} 
		return -1;
	}
	public static int getNthFib(int n) {
	    // Write your code here.
	 
			if( n == 0 || n ==1 )
				return n;
			return getNthFib(n - 1) + getNthFib(n-2);
			
	    // return -1;
	  }
} 
  