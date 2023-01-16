package oop_interface;

public interface USMedical extends WHO,UNHG {
	
	//a method with no body -- only method declaration
	//method prototype
	//abstract method
	
	
	public void physioServices();
	
	public void physioServices(int a);
	
	public int physioServices(int a, int b);
	
	public void cardioServices();
	
	public void neuroServices();
	
	public void emergencyServices();
	
	//JDK 1.8
//	1. can have static method with method body
	public static void USMedicalHistory() {
		System.out.println("US----USMedicalHistory");
	}
	
//	2. default method with method body
	
//	we can have n number static and default methods
	default void medicalRD() {
		System.out.println("US----medicalRD");
	}
	default void medicalSearch() {
		System.out.println("US----medicalSearch");
	}
}
