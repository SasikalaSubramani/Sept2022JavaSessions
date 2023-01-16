package ExceptionHandling;

public class Student {

	public static int getMarks(String name) {
		System.out.println("marks for: " + name);

		if (name.equals("aman")) {
			try {
				int i = 9 / 0;
				return 55;

			} catch (ArithmeticException e) {
				return 65;
			}
			finally {
				System.out.println("print mark sheet");
				return 75;
			}
//			return 90;
		} else if (name.equals("ravi")) {
			return 95;
		} else if (name.equals("swathi")) {
			return 80;
		} else
			System.out.println("Student name not found");
		return -1;
	}

	public static void main(String[] args) {
		int m1 = getMarks("aman");
		System.out.println(m1);
		
		
		//finally examples
		
//		DB connection steps
		// make the connection with DB:sql, Oracle
		//pass username and pwd and ip
//		try{
		//hit sql query -- there might be some exception
//		}
//		catch{SQLException{
//		
//		}
//		finally {
//			close db connenction
//		}
		
		//results
		//print results on the Ui
		
		//quit browser
		
	

	}

}
