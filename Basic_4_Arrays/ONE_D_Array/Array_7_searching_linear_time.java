// 
// Decompiled by Procyon v0.5.36
// 

package Basic_4_Arrays.ONE_D_Array;

import java.util.Scanner;

public class Array_7_searching_linear_time
{
    static Scanner in;
    
    static {
        Array_7_searching_linear_time.in = new Scanner(System.in);
    }
    
    public static void main(final String[] args) {
        System.out.print("Element to search: ");
        final int n = Array_7_searching_linear_time.in.nextInt();
        final int[] array = takeinput();
        linear_search(array, n);
    }
    
    public static int[] takeinput() {
        System.out.print("Array SIZE: ");
        final int n = Array_7_searching_linear_time.in.nextInt();
        final int[] arr = new int[n];
        System.out.print("Elements: ");
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = Array_7_searching_linear_time.in.nextInt();
        }
        return arr;
    }
    
    public static void display(final int[] a) {
        for (final int val : a) {
            System.out.println(val);
        }
    }
    
    public static void linear_search(final int[] srr, final int el) {
        boolean flag = false;
        for (int i = 0; i < srr.length; ++i) {
            if (srr[i] == el) {
                System.out.println("Element found at index: " + i + " & Position: " + (i + 1));
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Not found");
        }
    }
}
