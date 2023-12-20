package JavaConcepts;

// Concept of Nested Loops

public class pb1 {

	public static void main(String[] args) {
		// Nested Loops
		for (int i = 1; i <= 4; i++) { // Outer for loop - This block will loop 4 times
			System.out.println("This is outerloop value: " + i);

			for (int j = 10; j <= 12; j++) {
				System.out.println("innerloop value: " + j);
			}
			System.out.println("Outerloop Finished");
		}
	}

}
// 	1 2 3 4 
//	5 6 7 
//	8 9 
//	10
