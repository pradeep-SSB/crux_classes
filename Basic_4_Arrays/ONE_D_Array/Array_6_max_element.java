// 
// Decompiled by Procyon v0.5.36
// 

package Basic_4_Arrays.ONE_D_Array;

import java.util.Scanner;

public class Array_6_max_element
{
    static Scanner in;
    
    static {
        Array_6_max_element.in = new Scanner(System.in);
    }
    
    public static void main(final String[] args) {
        System.out.println("Array Size: ?");
        final int n = Array_6_max_element.in.nextInt();
        final int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        System.out.println("Elements: ");
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = Array_6_max_element.in.nextInt();
        }
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
