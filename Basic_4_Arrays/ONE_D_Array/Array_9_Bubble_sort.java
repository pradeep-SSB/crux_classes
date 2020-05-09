// 
// Decompiled by Procyon v0.5.36
// 

package Basic_4_Arrays.ONE_D_Array;

import java.util.Scanner;

public class Array_9_Bubble_sort
{
    static Scanner in;
    
    static {
        Array_9_Bubble_sort.in = new Scanner(System.in);
    }
    
    public static void main(final String[] args) {
        final int[] array = takeinput();
        Bubble_sort(array);
    }
    
    public static int[] takeinput() {
        System.out.print("Size: ");
        final int n = Array_9_Bubble_sort.in.nextInt();
        final int[] arr = new int[n];
        System.out.println("Elements: ");
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = Array_9_Bubble_sort.in.nextInt();
        }
        return arr;
    }
    
    public static void display(final int[] arr) {
        for (final int val : arr) {
            System.out.print(String.valueOf(val) + " ");
        }
    }
    
    public static void Bubble_sort(final int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = 0; j < arr.length - 1 - i; ++j) {
                if (arr[j + 1] < arr[j]) {
                    final int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        display(arr);
    }
}
