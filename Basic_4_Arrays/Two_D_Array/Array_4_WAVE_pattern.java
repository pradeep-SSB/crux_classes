// 
// Decompiled by Procyon v0.5.36
// 

package Basic_4_Arrays.Two_D_Array;

import java.util.Scanner;

public class Array_4_WAVE_pattern
{
    public static Scanner in;
    
    static {
        Array_4_WAVE_pattern.in = new Scanner(System.in);
    }
    
    public static void main(final String[] args) {
        final int[][] array = take_input();
        wave_print(array);
    }
    
    public static void wave_print(final int[][] arr) {
        for (int row = 0; row < arr.length; ++row) {
            if (row % 2 == 0) {
                for (int col = 0; col < arr[row].length; ++col) {
                    System.out.print(String.valueOf(arr[row][col]) + " ");
                }
            }
            else {
                for (int col = arr[row].length - 1; col >= 0; --col) {
                    System.out.print(String.valueOf(arr[row][col]) + " ");
                }
            }
            System.out.println();
        }
    }
    
    public static int[][] take_input() {
        System.out.println("ROW size: ");
        final int rows = Array_4_WAVE_pattern.in.nextInt();
        final int[][] arr = new int[rows][];
        for (int row = 0; row < arr.length; ++row) {
            System.out.println("Col size: ");
            final int cols = Array_4_WAVE_pattern.in.nextInt();
            arr[row] = new int[cols];
            for (int col = 0; col < cols; ++col) {
                arr[row][col] = Array_4_WAVE_pattern.in.nextInt();
            }
        }
        return arr;
    }
}
