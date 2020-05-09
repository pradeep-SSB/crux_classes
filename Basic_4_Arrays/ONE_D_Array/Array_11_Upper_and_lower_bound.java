// 
// Decompiled by Procyon v0.5.36
// 

package Basic_4_Arrays.ONE_D_Array;

import java.util.Scanner;

public class Array_11_Upper_and_lower_bound
{
    static Scanner in;
    
    static {
        Array_11_Upper_and_lower_bound.in = new Scanner(System.in);
    }
    
    public static void main(final String[] args) {
        System.out.println("Enter Data to be search: ");
        final int N = Array_11_Upper_and_lower_bound.in.nextInt();
        final int[] array = takeinput();
        System.out.print("Element: " + N + " upper_bound(Index): ");
        System.out.println(upper_bound(array, N));
        System.out.print("Element: " + N + " lower_bound(Index): ");
        System.out.println(lower_bound(array, N));
    }
    
    public static int[] takeinput() {
        System.out.print("Size: ");
        final int n = Array_11_Upper_and_lower_bound.in.nextInt();
        final int[] arr = new int[n];
        System.out.println("Elements: ");
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = Array_11_Upper_and_lower_bound.in.nextInt();
        }
        return arr;
    }
    
    public static int upper_bound(final int[] arr, final int data) {
        int L = 0;
        int R = arr.length - 1;
        int ans = -1;
        while (L <= R) {
            final int mid = (L + R) / 2;
            if (data == arr[mid]) {
                ans = mid;
                L = mid + 1;
            }
            else if (data < arr[mid]) {
                R = mid - 1;
            }
            else {
                L = mid + 1;
            }
        }
        return ans;
    }
    
    public static int lower_bound(final int[] arr, final int data) {
        int L = 0;
        int R = arr.length - 1;
        int ans = -1;
        while (L <= R) {
            final int mid = (L + R) / 2;
            if (data == arr[mid]) {
                ans = mid;
                R = mid - 1;
            }
            else if (data < arr[mid]) {
                R = mid - 1;
            }
            else {
                L = mid + 1;
            }
        }
        return ans;
    }
}
