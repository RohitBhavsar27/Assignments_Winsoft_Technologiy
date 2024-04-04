package coding_questions;
import java.util.Arrays;

public class Array_Merge {

    //method to shift all non-zero elements of X to the start
    private static int shiftNonVacantElements(int[] X) {
        int count = 0; 
        for (int num : X) {
            if (num != 0) {
                X[count++] = num;
            }
        }
        return count; 
    }

    //method to merge Y into X
    public static void mergeArrays(int[] X, int[] Y) {
        int totalNonZeros = shiftNonVacantElements(X); 
        int XIndex = totalNonZeros - 1; 
        int YIndex = Y.length - 1; 
        int mergeIndex = X.length - 1; 
        
        // Merge X and Y, starting from the end
        while (XIndex >= 0 && YIndex >= 0) {
            // Place the larger of the two elements at the current merge position
            if (X[XIndex] > Y[YIndex]) {
                X[mergeIndex--] = X[XIndex--];
            } else {
                X[mergeIndex--] = Y[YIndex--];
            }
        }

        // Copy any remaining elements from Y into X
        while (YIndex >= 0) {
            X[mergeIndex--] = Y[YIndex--];
        }
    }

    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};
        
        mergeArrays(X, Y);
        
        System.out.println(Arrays.toString(X));
    }
}
