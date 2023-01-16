package Assignments;

public class LoopsAssignment1 {

	public static void main(String[] args) {

		// 1. WAP to print following output:
		System.out.println("1. WAP to print following output:");
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			System.out.println("I am Batman");
		}

		// 2. WAP to print following output:

		System.out.println();
		System.out.println("2. WAP to print following output:");
		for (int i = 0; i < 10; i++) {
			System.out.println("I am Batman " + i);
		}

		// 3. WAP to print 10 to 1 using for, while and do-while loop

		System.out.println();
		System.out.println("3. WAP to print 10 to 1 using for, while and do-while loop");
		System.out.println("Using while loop");
		int n = 10;
		while(n>=1) {
			System.out.println(n);
			n--;
		}
		System.out.println("Using Do-While loop");
		int m=10;
		do {
			System.out.println(m);
			m--;
		} while (m>=1);
	}

}
