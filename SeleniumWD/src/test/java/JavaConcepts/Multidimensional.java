package JavaConcepts;

// Concept - Multidimensional Array
// In an Multidimensional Array in an index 

public class Multidimensional {

	public static void main(String[] args) {

		// To declare multi-dimentional array - We need to provide [][]
		// First [] - represents X axis or row what ever you think
		// Second [] - represents Y axis or column what ever you think

		// I want to declare integer multidimensional array
		// a[row][column]
		int a[][] = new int[2][3]; // Here X axis take 2 values ie 2 rows
									// Y axis takes 3 values ie 3 columns

		// How do you pass the values into it?

		// 2 4 5
		// 3 4 7

		// first argument stands for rows
		// Second argument stands for columns
		// Now lets pass the values in to it.

		a[0][0] = 2; // In 0th row which is the first argument, zero column pass value = 2
		a[0][1] = 4; // in 0th row which is first argument, 1st column pass value = 4
		a[0][2] = 5;
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 7;

		// So I have feeded all my values in to Multidimensional array

		// Now someone asks you to print out 2nd row 1st column[expected value is 3]
		System.out.println(a[1][0]);

		// Declare multidimensional array in simple format
		// Complete first row as a first argument.
		// And complete second row as second argument.
		// So array will assume that
		// { 2, 4, 5 } this is all at the 0th index
		// { 3, 4, 7 } this is the 1st index

		// 2 4 5
		// 3 4 7
		// 5 9 1

		int b[][] = { { 2, 4, 5 }, { 3, 4, 7 }, { 5, 9, 1 } };

		// I need to print 9 value
		System.out.println(b[2][1]);

		// How do you print all these values? -- Consider array of a[][]
		System.out.println("-------------Print all values from Multidimentional array-----------");

		for (int i = 0; i < 2; i++) {
			// System.out.println("Outerloop1" + i);
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j]);
				System.out.print("\t");

			}
			System.out.println("\t");

		}

	}

}
