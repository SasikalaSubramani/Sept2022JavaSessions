package javasessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {

		// array: can hold only similar type of data

		// 2 major limitations
		// size is fixed: static array
		// only stores similar type of data

		// int array
		int i[] = new int[4];

		// new key word helps to create memory
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i[0]);
		System.out.println(i[3]);
		System.out.println(i[1]);
//		System.out.println(i[4]);//.ArrayIndexOutOfBoundsException
//		System.out.println(i[-1]);//.ArrayIndexOutOfBoundsException
//		System.out.println(i);//garbage value

		System.out.println(Arrays.toString(i));

		// to print all the value from array

		int len = i.length;

		for (int k = 0; k < len; k++) {

			System.out.println(i[k]);

		}

		// while loop
		System.out.println("-----------------------");

		int p = 0;

		while (p < len) {
			System.out.println(i[p]);// 10 20 30 40
			p++;
		}
		// as the iterations are fixed it is better to use for loop

		System.out.println("-----------------------");

		for (int k = 0; k < len; k++) {
			if (i[k] == 20) {
				System.out.println("Bye!!");
				break;
			}
		}
		// byte, short, int, long
		// double array
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 23.44;
		d[2] = 34.55;
		System.out.println();
		System.out.println("******************");

		for (int t = 0; t < d.length; t++) {
			System.out.println(d[t]);
		}

		// char array:

		// String array:

		String emp[] = new String[4];
		emp[0] = "Sasi";
		emp[1] = "Tharsh";
		emp[2] = "Som";
		emp[3] = "Kumar";

		System.out.println("Total employees: " + emp.length);

		System.out.println(Arrays.toString(emp));

		for (int s = 0; s < emp.length; s++) {
			System.out.println(emp[s]);
			if (emp[s].equals("Tharsh")) {
				System.out.println("Tharsh Baby!!!!!!");
			}
		}

		// for each loop:
		// enhanced /advance for loop

		System.out.println("*************");

		int num[] = new int[4];
		num[0] = 100;
		num[1] = 200;
		num[2] = 300;
		num[3] = 400;

		for (int value : num) {
			System.out.println(value);
		}

		System.out.println("*********************");

		String employee[] = new String[5];
		employee[0] = "Sasi";
		employee[1] = "Tharsh";
		employee[2] = "Som";
		employee[3] = "Kumar";
		employee[4] = "Lax";

		for (String s : employee) {

			if (s.equals("Tharsh")) {
				System.out.print(s);
				System.out.println(" Baby!!!!!!");
			} else {
				System.out.println(s);
			}
		}

		// Array literals:
		int pop[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -89 };

		System.out.println("*****************");

		System.out.println(pop.length);
		System.out.println("Li = " + 0);
		System.out.println("Hi = " + (pop.length - 1));

		// String literals: static array
		String str[] = { "java", "python", "dot net" };
		String str1[] = { "java", "python", "dot net" };

		// li = 0;
		// length = 3;
		// hi = length - 1;
		// length = hi + 1;

		System.out.println(Arrays.toString(str));
		System.out.println(str.length - 1);
		System.out.println(1 + ":" + str[1]);

		// Object array: static array

		System.out.println("Object Array");

		Object empData[] = new Object[5];

		empData[0] = "Vani";
		empData[1] = 25;
		empData[2] = 25.66;
		empData[3] = 'f';
		empData[4] = true;

		System.out.println(empData.length);

		System.out.println(Arrays.toString(empData));

		// for loop
		for (int k = 0; k < empData.length; k++) {
			System.out.println(empData[k]);
		}

		// for each loop

		for (Object e : empData) {
			System.out.println(e);
		}

		// Object liters

		Object userInfo[] = { "Punith", 26, 34.55, 'm', false };

		System.out.println(userInfo.length);
	}
}