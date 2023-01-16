package oop_interface;

public interface UKMedical {
	
	public void ENTServices();
	
	public void pediaServices();
	
	public void emergencyServices();
	
	default void medicalRD() {
		System.out.println("UK----medicalRD");
	}

}
