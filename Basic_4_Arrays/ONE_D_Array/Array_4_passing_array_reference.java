// 
// Decompiled by Procyon v0.5.36
// 

package Basic_4_Arrays.ONE_D_Array;

public class Array_4_passing_array_reference
{
    public static void main(final String[] args) {
        final int[] arr = { 10, 20, 30, 40 };
        final int[] brr = { 100, 200, 300, 500 };
        int[] array;
        for (int length = (array = arr).length, i = 0; i < length; ++i) {
            final int val = array[i];
            System.out.print(String.valueOf(val) + "\t");
        }
        System.out.println();
        int[] array2;
        for (int length2 = (array2 = brr).length, j = 0; j < length2; ++j) {
            final int gal = array2[j];
            System.out.print(String.valueOf(gal) + "\t");
        }
        System.out.println("\n");
        swap(arr, brr);
        int[] array3;
        for (int length3 = (array3 = arr).length, k = 0; k < length3; ++k) {
            final int val = array3[k];
            System.out.print(String.valueOf(val) + "\t");
        }
        System.out.println();
        int[] array4;
        for (int length4 = (array4 = brr).length, l = 0; l < length4; ++l) {
            final int gal = array4[l];
            System.out.print(String.valueOf(gal) + "\t");
        }
        System.out.println("\n");
    }
    
    public static void swap(int[] one, int[] two) {
        int[] array;
        for (int length = (array = one).length, i = 0; i < length; ++i) {
            final int chk = array[i];
            System.out.print(String.valueOf(chk) + "\t");
        }
        System.out.println();
        int[] array2;
        for (int length2 = (array2 = two).length, j = 0; j < length2; ++j) {
            final int s_chk = array2[j];
            System.out.print(String.valueOf(s_chk) + "\t");
        }
        System.out.println("\n");
        final int[] temp = two;
        two = one;
        one = temp;
        int[] array3;
        for (int length3 = (array3 = one).length, k = 0; k < length3; ++k) {
            final int chk2 = array3[k];
            System.out.print(String.valueOf(chk2) + "\t");
        }
        System.out.println();
        int[] array4;
        for (int length4 = (array4 = two).length, l = 0; l < length4; ++l) {
            final int s_chk2 = array4[l];
            System.out.print(String.valueOf(s_chk2) + "\t");
        }
        System.out.println("\n");
    }
}
