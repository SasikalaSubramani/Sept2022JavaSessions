package Assignments;

public class TestClass {

	public static void main(String[] args) {

		System.out.println(isLeapYear(1900));
		System.out.println(leapYear(1900));

	}

	public static boolean leapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				}
			}
		}
		return false;

	}

	static boolean isLeapYear(int year) {
		if (year % 4 != 0) {
			return false;
		} else if (year % 400 == 0) {
			return true;
		} else if (year % 100 == 0) {
			return false;
		} else {
			return true;
		}
	}

}
