package JavaConcepts;

// Concept of while loop, do-while loops

public class whiledemo {

	public static void main(String[] args) {

		// While loop

		// I need to print numbers from 1 to 10 sequentially.
		System.out.println("----While Loop - To print 1 to 10 numbers sequentially------");

		int i = 0;

		while (i <= 10) {
			System.out.println(i);
			i++; // Here we are incrementing i value
		}

		System.out.println("----While Loop - To print 1 to 10 numbers reverse order------");
		int k = 10;

		while (k >= 0) {
			System.out.println(k);
			k--; // Here we are decrementing j value
		}

		// do-while loop
		System.out.println("---- do-while Loop -- To print numbers from 20 to 30----");

		int j = 20;
		do {
			System.out.println(j);
			j++;
		} while (j > 30); // One loop of execution is guarantee in do-while loop.

	}

}
