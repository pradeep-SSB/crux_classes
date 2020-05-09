// 
// Decompiled by Procyon v0.5.36
// 

package Basic_4_Arrays.Two_D_Array;

import java.util.Scanner;

public class Array_1
{
    public static Scanner in;
    
    static {
        Array_1.in = new Scanner(System.in);
    }
    
    public static void main(final String[] args) {
        final int[][] arr = new int[3][3];
        System.out.println(arr);
        final int[][] nrr = new int[3][3];
        final int[][] prr = new int[3][3];
        display(prr);
        prr[0][0] = 10;
        prr[2][0] = 20;
        System.out.println("Updated Array: ");
        display(prr);
    }
    
    public static void display(final int[][] arr) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                System.out.print(String.valueOf(arr[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
