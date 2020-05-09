// 
// Decompiled by Procyon v0.5.36
// 

package Basic_4_Arrays.Two_D_Array;

import java.util.Scanner;

public class Array_2_taking_input
{
    public static Scanner in;
    
    static {
        Array_2_taking_input.in = new Scanner(System.in);
    }
    
    public static void main(final String[] args) {
        final int[][] array = taking_input();
        display(array);
        final int[][] arr = { { 1, 2, 3, 4 }, { 2, 3 }, { 32, 42, 3 } };
        display(arr);
    }
    
    public static int[][] taking_input() {
        System.out.println("Enter the number of Rows: ");
        final int rows = Array_2_taking_input.in.nextInt();
        final int[][] arr = new int[rows][];
        for (int row = 0; row < arr.length; ++row) {
            System.out.println("Enter the number of cols for row: " + row);
            final int cols = Array_2_taking_input.in.nextInt();
            arr[row] = new int[cols];
            for (int col = 0; col < cols; ++col) {
                System.out.println("Enter the col data for Row: " + row + " and column :" + col);
                arr[row][col] = Array_2_taking_input.in.nextInt();
            }
        }
        return arr;
    }
    
    public static void display(final int[][] arr) {
        for (int row = 0; row < arr.length; ++row) {
            for (int col = 0; col < arr[row].length; ++col) {
                System.out.print(String.valueOf(arr[row][col]) + " ");
            }
            System.out.println();
        }
    }
}
