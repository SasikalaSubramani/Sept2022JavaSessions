package Assignments;

import java.util.Arrays;

public class MethodAssignment {

	public String[] getEmpDevices(String employeeName) {

		System.out.println("Getting devices for employee: " + employeeName);

		String d[] = {};

		if (employeeName.equals("Naveen")) {
			String d1[] = { "macbook pro", "ipad", "mouse", "keyboard", "iphone14" };
			return d1;
		} else if (employeeName.equals("swathi")) {
			String d2[] = { "dell laptop", "samsung 7", "mouse" };
			return d2;
		} else if (employeeName.equals("Aman")) {
			String d3[] = { "macbook air", "iphone 13" };
			return d3;
		} else {
			System.out.println("emp name is not found....." + employeeName);
			return d;
		}
//		return d;
	}

	public static void main(String[] args) {
		MethodAssignment m = new MethodAssignment();

		String devices[] = m.getEmpDevices("Sasi");

		System.out.println("employee devices count: " + devices.length);
		System.out.println(Arrays.toString(devices));

	}

}
