package oop_inheritance;

public class Car extends Vehicle{
	
	int speed = 100;
	
	//final:
	// to prevent method overriding
	// to prevent inheritance
	// to provide the constant value
	
	//Private methods can not be overriden
	
	public void start() {
		System.out.println("Car----start");
	}
	public void stop() {
		System.out.println("Car----stop");
	}
	public void refuel() {
		System.out.println("Car----refuel");
	}
	
	public static void billing() {
		System.out.println("Car----billing");
	}

}
