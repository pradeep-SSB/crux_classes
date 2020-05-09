// 
// Decompiled by Procyon v0.5.36
// 

package Basic_4_Arrays.ONE_D_Array;

import java.util.Scanner;

public class Array_10_selection_sort
{
    static Scanner in;
    
    static {
        Array_10_selection_sort.in = new Scanner(System.in);
    }
    
    public static void main(final String[] args) {
        final int[] array = takeinput();
        selection_sort(array);
    }
    
    public static int[] takeinput() {
        System.out.print("Size: ");
        final int n = Array_10_selection_sort.in.nextInt();
        final int[] arr = new int[n];
        System.out.println("Elements: ");
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = Array_10_selection_sort.in.nextInt();
        }
        return arr;
    }
    
    public static void display(final int[] arr) {
        for (final int val : arr) {
            System.out.print(String.valueOf(val) + " ");
        }
    }
    
    public static void selection_sort(final int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            int min = i;
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
                final int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        display(arr);
    }
}
