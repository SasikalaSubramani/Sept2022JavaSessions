package oop_interface;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical {

	// US
	@Override
	public void physioServices() {
		System.out.println("FH---physioServices");

	}
	@Override
	public void physioServices(int a) {
		
		System.out.println("FH---physioServices with 1 param");
	}

	@Override
	public int physioServices(int a, int b) {
		System.out.println("FH---physioServices with 2 param");
		return 0;
	}

	@Override
	public void cardioServices() {
		System.out.println("FH---cardioServices");

	}

	@Override
	public void neuroServices() {
		System.out.println("FH---neuroServices");

	}
	// UK

	@Override
	public void ENTServices() {
		System.out.println("FH---ENTServices");

	}

	@Override
	public void pediaServices() {
		System.out.println("FH---pediaServices");

	}

	// indian

	@Override
	public void DentalServices() {
		System.out.println("FH---DentalServices");

	}

	@Override
	public void orthoServices() {
		System.out.println("FH---orthoServices");

	}
	// common method

	@Override
	public void emergencyServices() {

		System.out.println("FH---emergencyServices");
	}

	// individual
	public void medicalTraining() {
		System.out.println("FH---medicalTraining");
	}

	public void medicalBills() {
		System.out.println("FH---medicalBills");
	}

	@Override
	public void covidVaccination() {
		System.out.println("FH---covidVaccination");
		
	}

	@Override
	public void releaseFund() {
	
		System.out.println("FH----releaseFund");
		
	}
	
	//Method hiding
	public static void USMedicalHistory() {
		System.out.println("FH----USMedicalHistory");
	}
	
	@Override
	public void medicalRD() {
		System.out.println("FH----medicalRD");
	}

	

}
