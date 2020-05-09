// 
// Decompiled by Procyon v0.5.36
// 

package Basic_4_Arrays.Matrix_based;

public class Spiral_pattern
{
    public static void main(final String[] args) {
        final int[][] arr = { { 11, 12, 13, 14 }, { 15, 16, 17, 18 }, { 19, 20, 21, 22, 23 }, { 23, 24, 25, 26 } };
        int left = 0;
        int right = arr.length - 1;
        int top = 0;
        int bottom = arr.length - 1;
        int dir = 1;
        int count = (right + 1) * (bottom + 1);
        while (left <= right && top <= bottom) {
            if (count > 0 && dir == 1) {
                for (int i = left; i <= right; ++i) {
                    System.out.print(String.valueOf(arr[top][i]) + " ");
                    --count;
                }
                dir = 2;
                ++top;
            }
            if (count > 0 && dir == 2) {
                for (int i = top; i <= bottom; ++i) {
                    System.out.print(String.valueOf(arr[i][right]) + " ");
                    --count;
                }
                dir = 3;
                --right;
            }
            if (count > 0 && dir == 3) {
                for (int i = right; i >= left; --i) {
                    System.out.print(String.valueOf(arr[bottom][i]) + " ");
                    --count;
                }
                dir = 4;
                --bottom;
            }
            if (count > 0 && dir == 4) {
                for (int i = bottom; i >= top; --i) {
                    System.out.print(String.valueOf(arr[i][left]) + " ");
                    --count;
                }
                dir = 1;
                ++left;
            }
        }
    }
}
