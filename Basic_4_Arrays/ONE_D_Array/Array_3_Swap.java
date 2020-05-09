// 
// Decompiled by Procyon v0.5.36
// 

package Basic_4_Arrays.ONE_D_Array;

public class Array_3_Swap
{
    public static void main(final String[] args) {
        final int[] arr = { 1, 2, 3, 4, 10 };
        final int i = 0;
        final int j = 2;
        System.out.println(String.valueOf(arr[i]) + " & " + arr[j]);
        swap(arr[i], arr[j]);
        System.out.println(String.valueOf(arr[i]) + " & " + arr[j]);
        swapping(arr, i, j);
        System.out.println(String.valueOf(arr[i]) + " & " + arr[j]);
    }
    
    public static void swap(int one, int two) {
        final int temp = two;
        two = one;
        one = temp;
    }
    
    public static void swapping(final int[] brr, final int a, final int b) {
        final int temp = brr[b];
        brr[b] = brr[a];
        brr[a] = temp;
    }
}
