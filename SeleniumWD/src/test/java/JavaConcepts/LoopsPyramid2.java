package JavaConcepts;

public class LoopsPyramid2 {

	// Nested Class - Inverted Pyramid
	public static void main(String[] args) {
		int k = 1;
		for (int i = 1; i < 5; i++) { // Output we have 4 rows, so we considered 1 to 5 ie 4 times outerloop will work
			// System.out.println(i);
			for (int j = 1; j <= i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;

			}
			System.out.println(" ");

		}
	}
}

//1 
//2 3 
//4 5 6
//7 8 9 10
