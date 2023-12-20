package JavaConcepts;

public class LoopsPyramid {
	// Nested Class - Printing Pyramid Triangle
	public static void main(String[] args) {

		int k = 1;
		for (int i = 0; i <= 4; i++) {
			// System.out.println("Outer Loop Started");
			for (int j = 1; j <= 4 - i; j++) { // j = 1, 2, 3, 4
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");

		}

		System.out.println("My Code reverse pyramid");

		for (int a = 0; a <= a - 1; a++) {
			System.out.println(a);
		}
	}
}

// Expected output here.

//	1 2 3 4 
//	5 6 7 
//	8 9 
//	10
