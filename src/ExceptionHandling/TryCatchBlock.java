package ExceptionHandling;

public class TryCatchBlock {

	String name;

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		TryCatchBlock obj = new TryCatchBlock();
//		obj = null;
		try {
			obj.name = "Tom";// NPE
			int i = 9 / 0;// AE
			System.out.println("Hello");
		}
		// We can write Throwable or Exception or actual exception name
		// throwable is extending object class but we can not use object here
		// Correct way is writing proper exception name
		// with one try block we can write multiple catch block
//		catch (Throwable e)
//		catch (Exception e)
//		catch (Object e)// this line gives error
		catch (ArithmeticException e) {
			System.out.println("AE is coming........");
			try {
				int p = 2 / 0;
			} catch (ArithmeticException e1) {
				e1.printStackTrace();
			}
			System.out.println("Byee!!!!!");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("NE is coming........");
			e.printStackTrace();
		} catch (Error e) {
			System.out.println("Error is coming........");
			e.printStackTrace();
		}

		System.out.println("Bye");

		System.out.println("Landing on home page");

		int a[] = new int[2];

		try {
			a[4] = 2;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOE is coming");
			e.printStackTrace();
		}
		System.out.println("Logout");

	}

}
