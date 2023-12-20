package JavaConcepts;

// -- Concept of multidimensional array Puzzle

public class InterviewMinNumber {

	// 2 4 5
	// 3 4 7
	// 1 2 9
	// Print minimum number from the above array

	public static void main(String[] args) {
		int abc[][] = { { 2, 4, 5 }, { 3, 4, 7 }, { 1, 2, 9 } };

		int min = abc[0][0];

		for (int i = 0; i < 3; i++) {

			// System.out.println("Now i value is " + i);

			for (int j = 0; j < 3; j++) {
				// System.out.println("Now j value is " + j);
				// System.out.println("Now array current value is: " + abc[i][j]);
				// System.out.println("Now min value is " + min);
				if (abc[i][j] < min) {
					min = abc[i][j];
				}

			}
		}

		System.out.println("Minimum number from the above array is: " + min);

// The simple tricky part can be achieved. 
// By assuming that index value abc[0][0] position is the smallest,
// 0th row & 0th column  ie value 2  
// Use breakpoints, and debug it.
// Traverse each number and compare

	}

}
