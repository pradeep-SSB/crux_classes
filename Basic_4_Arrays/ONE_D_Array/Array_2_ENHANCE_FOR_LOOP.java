// 
// Decompiled by Procyon v0.5.36
// 

package Basic_4_Arrays.ONE_D_Array;

public class Array_2_ENHANCE_FOR_LOOP
{
    public static void main(final String[] args) {
        final int[] arr = new int[10];
        int[] array;
        for (int length = (array = arr).length, j = 0; j < length; ++j) {
            final int val = array[j];
            System.out.println(val);
        }
        final int[] brr = { 1, 2, 3, 4, 5 };
        int[] array2;
        for (int length2 = (array2 = brr).length, k = 0; k < length2; ++k) {
            final int i = array2[k];
            System.out.print(String.valueOf(i) + "\t");
        }
    }
}
