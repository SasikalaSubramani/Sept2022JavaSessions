package oop_inheritance;

// is a relationship 
// BMW is a Car
public class BMW extends Car{
	
	int speed = 200;
	
	//Method overriding: Poly (many) + Morphism (forms) : run time / dynmic
	//multiple inheritance is not possible with the class as it creates diamond problem
	//multi level inheritance is allowed
	//when we have method in parent and the same method in child class
	//with the same name
	//with the same no of param
	//with the same seq of param
	//with the same return type
	//we can not override static methods
	
	@Override
	public void start() {
		System.out.println("BMW---start");
	}
	public void autoParking() {
		System.out.println("BMW---auto parking");
	}
	//Method hiding:
	// having same static method in parent and child class 
	public static void billing() {
		System.out.println("BMW----billing");
	}
	//Has - A relationship - composition in java
	public void getBMWEngineInfo() {
		Engine eg = new Engine();
		eg.engine();
	}

}
