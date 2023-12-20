package JavaConcepts;

//-- Concept of multidimensional array Puzzle

public class InterviewMinMaxNumber {

	public static void main(String[] args) {

		int abc[][] = { { 2, 4, 1 }, { 3, 0, 7 }, { 6, 10, 9 } };

		int minNumber = abc[0][0];
		int minColumn = 0;

		for (int i = 0; i < 3; i++) {
			// System.out.println("OL is " + i);

			for (int j = 0; j < 3; j++) {
				// System.out.println("IL value is " + j);
				// System.out.println("Now array current value is: " + abc[i][j]);
				// System.out.println("MinNumber value is " + minNumber);

				if (abc[i][j] < minNumber) {
					minNumber = abc[i][j];
					minColumn = j;
				}
			}
		}

		// After executing above for loops - we got minColumn = 1
		int max = abc[0][minColumn];
		int k = 0;
		while (k < 3) {
			if (abc[k][minColumn] > max) {
				max = abc[k][minColumn];
			}
			k++;
		}
		// System.out.println("Array Min Number value is " + minNumber);
		// System.out.println("Columnname is " + minColumn);
		System.out.println(max);

	}

}

//  2  4  1 
//  3  0  7 
//  6  10  9 

//Find the minimum number from a row, in that row find the max value from the column.
//So I'm Expecting output =  4 

// Tips to solve this :
// Step1: Find the minimum number
// Step2: Identify the column of minimum number
// Step3: Find the maximum number in identified column 
