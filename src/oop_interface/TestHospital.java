package oop_interface;

public class TestHospital {

	public static void main(String[] args) {
		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.neuroServices();
		fh.physioServices();
		fh.pediaServices();
		fh.ENTServices();
		fh.orthoServices();
		fh.DentalServices();
		fh.medicalTraining();
		fh.medicalBills();
		fh.emergencyServices();
		fh.medicalNews();
		fh.covidVaccination();
		
		// we can not create object for interfaces		
//		USMedical um = new USMedical();
		
		//top casting
		//child class object can be referred by parent interface variable
		
		USMedical us= new FortisHospital();
		
		us.cardioServices();
		us.neuroServices();
		us.cardioServices();
		us.emergencyServices();
		
		//top casting
		//child class object can be referred by grand parent interface variable
		WHO who = new FortisHospital();
		who.covidVaccination();
		
		
		
		
		

	}

}
