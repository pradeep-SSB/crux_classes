// 
// Decompiled by Procyon v0.5.36
// 

package Basic_4_Arrays.ONE_D_Array;

import java.util.Scanner;

public class Array_5_operations
{
    static Scanner input;
    
    static {
        Array_5_operations.input = new Scanner(System.in);
    }
    
    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);
        final int[] array = takeinput();
        display(array);
    }
    
    public static int[] takeinput() {
        System.out.println("Enter the Size of array n: ");
        final int n = Array_5_operations.input.nextInt();
        final int[] arr = new int[n];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = Array_5_operations.input.nextInt();
        }
        return arr;
    }
    
    public static void display(final int[] a) {
        for (final int val : a) {
            System.out.println(val);
        }
    }
}
