package JavaConcepts;

//-- Concept of multidimensional array Puzzle

public class InterviewMaxNumber {

	public static void main(String[] args) {

		int abc1[][] = { { 2, 4, 5 }, { 3, 4, 7 }, { 1, 2, 9 } };

		// Print Maximum number from the above array

		int MaxNumber = abc1[0][0];

		for (int m = 0; m < 3; m++) {

			// System.out.println("Now m value is " + m);

			for (int n = 0; n < 3; n++) {

				// System.out.println("Now m value is " + n);
				// System.out.println("Now array current value is: " + abc1[i][j]);
				// System.out.println("Now minNumber value is " + MaxNumber);

				if (abc1[m][n] > MaxNumber) {
					MaxNumber = abc1[m][n];
				}
			}

		}
		System.out.println("Maximum number from the above array is: " + MaxNumber);
	}

}
