package Assignments;

public class SwitchCaseAssignements {

	public static void main(String[] args) {

		System.out.println("**********Assignment1***********");

		String day = "Sunday";

		switch (day.toLowerCase()) {
		case "monday":
			System.out.println("Monday is a working day");
			break;
		case "tuesday":
			System.out.println("Tuesday is a working day");
			break;
		case "wednesday":
			System.out.println("Wednesday is a working day");
			break;
		case "thursday":
			System.out.println("Thursday is a working day");
			break;
		case "friday":
			System.out.println("Friday is a working day");
			break;
		case "saturday":
			System.out.println("Holiday!! Let's Party!!!!");
			break;
		case "sunday":
			System.out.println("Holiday!! Rest!!");
			break;

		default:
			System.out.println("Pass the correct day.... " + day);
			break;
		}

		System.out.println();
		System.out.println("**********Assignment2***********");

		String env = "qa";
		switch (env) {
		case "dev":
			System.out.println("Launch dev URL");
			break;
		case "qa":
			System.out.println("Launch qa URL");
			break;
		case "stage":
			System.out.println("Launch stage URL");
			break;
		case "uat":
			System.out.println("Launch uat URL");
			break;
		case "prod":
			System.out.println("Launch prod URL");
			break;
		
		default:
			System.out.println("Pass the correct env.... " + env);
			break;
		}
	}

}
