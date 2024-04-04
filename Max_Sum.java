package coding_questions;

public class Max_Sum {

	public static int maxSumPath(int[] X, int[] Y) {
		int sumX = 0; // Sum of elements in X
		int sumY = 0; // Sum of elements in Y
		int totalSum = 0; // Total maximum sum

		int i = 0, j = 0;

		while (i < X.length && j < Y.length) {
			// Add elements of X[] to sumX
			if (X[i] < Y[j]) {
				sumX += X[i++];
			}
			// Add elements of Y[] to sumY
			else if (X[i] > Y[j]) {
				sumY += Y[j++];
			}
			// Found a common element
			else {
				// Include the maximum sum path so far
				totalSum += Math.max(sumX, sumY) + X[i];

				// Reset the sums for next common element
				sumX = 0;
				sumY = 0;

				// Skip duplicates
				while (i < X.length && j < Y.length && X[i] == Y[j]) {
					i++;
					j++;
				}
			}
		}

		// Add remaining elements of X[]
		while (i < X.length) {
			sumX += X[i++];
		}

		// Add remaining elements of Y[]
		while (j < Y.length) {
			sumY += Y[j++];
		}

		// Add the maximum of two sums of remaining elements
		totalSum += Math.max(sumX, sumY);

		return totalSum;
	}

	public static void main(String[] args) {
		int[] X = { 3, 6, 7, 8, 10, 12, 15, 18, 100 };
		int[] Y = { 1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50 };

		int maxSum = maxSumPath(X, Y);

		System.out.println("The maximum sum path is: " + maxSum);
	}
}
