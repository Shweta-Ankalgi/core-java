package java1;

class Vehicle{
	
	//Attributes
	String brand = "Toyota";
	String model = "Hilux";
	int year = 2025;
	
	//Methods to drive
	public void drive()
	{
		System.out.println("This "+brand+ " "+model+" "+year+" is driving. ");
		
	}
	
	
}

class Car extends Vehicle{
	
	//Additional Attribute
	String color = "White";
	
	//Method to honk
	public void honk() {
		
		System.out.println("The "+color+" "+brand+ " "+model+ " honks. ");
		
	}
}


public class Inheritance_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car obj = new Car();
		obj.drive();
		obj.honk();

	}

}
