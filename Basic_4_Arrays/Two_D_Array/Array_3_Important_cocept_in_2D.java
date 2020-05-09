// 
// Decompiled by Procyon v0.5.36
// 

package Basic_4_Arrays.Two_D_Array;

public class Array_3_Important_cocept_in_2D
{
    public static void main(final String[] args) {
        final int[][] arr = { new int[4], null, null };
        System.out.println(arr[0]);
        arr[2] = new int[3];
        System.out.println(arr[2]);
        System.out.println(arr[1]);
        System.out.println(arr[0][2]);
        arr[1] = new int[2];
        display(arr);
    }
    
    public static void display(final int[][] arr) {
        System.out.println();
        for (int row = 0; row < arr.length; ++row) {
            for (int col = 0; col < arr[row].length; ++col) {
                System.out.print(String.valueOf(arr[row][col]) + " ");
            }
            System.out.println();
        }
    }
}
