// 
// Decompiled by Procyon v0.5.36
// 

package Basic_4_Arrays.ONE_D_Array;

public class Array_8_binary_search
{
    public static void main(final String[] args) {
        final int[] trr = { 20, 20, 30, 40, 50, 60 };
        final int n = 20;
        System.out.println(binary_search(trr, n));
    }
    
    public static int binary_search(final int[] arr, final int el) {
        int L = 0;
        int R = arr.length - 1;
        while (L <= R) {
            final int mid = (L + R) / 2;
            if (el > arr[mid]) {
                L = mid + 1;
            }
            else {
                if (el >= arr[mid]) {
                    return mid + 1;
                }
                R = mid - 1;
            }
        }
        return -1;
    }
}
