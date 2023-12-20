package JavaConcepts;

public class LoopsPyramid4 {

	public static void main(String[] args) {

		int k = 3;
		for (int i = 1; i < 4; i++) { // i=2 = j= 2*3= 6
			// System.out.println("OL");

			for (int j = 1; j <= i * k; j++) {
				System.out.println(j);

			}

			System.out.println("OL ended");

		}

	}
}

//
//Expected Output
//3 
//6  9
//12 15 18