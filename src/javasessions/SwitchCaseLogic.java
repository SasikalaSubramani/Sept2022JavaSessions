package javasessions;

public class SwitchCaseLogic {

	public static void main(String[] args) {
		
		String browser="chrome";
		
		//break can be used only for loop and switch not for if conditions
		
		switch (browser.toLowerCase()) {
		case "chrome":
			System.out.println("launch chrome");
			//nested switch
			String version="85";
			switch (version) {
			case "105":
				System.out.println("Launch chrome version 105");
				break;
			case "90":
				System.out.println("Launch chrome version 90");
				break;
			case "91":
				System.out.println("Launch chrome version 91");
				break;

			default:
				System.out.println("please pass the correct browser version....." + version);
				break;
			}
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		case "ie":
			System.out.println("launch ie");
			break;
			// when we remove brk from default, case written after default statement also gets executed.
		default:
			System.out.println("please pass the correct browser....." + browser);
			break;
			
		case "brave":
			System.out.println("launch brave");
			break;
		}
		
		// here we cannot cover all the cases so it is better to use nested if for this case
		//switch doesn't support any range
		
		System.out.println("************************************************");
		int mark =90;
		
		switch (mark) {
		case 90:
			System.out.println("Grade A");
			break;
		case 80:
			System.out.println("Grade A");
			break;
		case 100:
			System.out.println("Grade A");
			break;
			
		default:
			System.out.println("FAIL");
			break;
		}
		// weekdays -- mon to sunday
		//env -- dev,qa,uat,stage,prod
		//switch case with double,boolean,long and float is not supported
		// switcg case works for int, short, byte, char and string 
		
		char ch='a';
		
		switch (ch) {
		case 'a':
			System.out.println(" a is vowel");
			break;
		case 'e':
			System.out.println(" e is vowel");
			break;
		case 'i':
			System.out.println(" i is vowel");
			break;
		case 'o':
			System.out.println(" o is vowel");
			break;
		case 'u':
			System.out.println(" u is vowel");
			break;

		default:
			System.out.println("not a vowel");
			break;
		}

	}

}
