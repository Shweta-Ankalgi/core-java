package java1;

class Person1{
	
	//attributes
	String name = "Madhavi";
	int age = 22;
	
	//method to speak
	public void speak() {
		
		System.out.println("She is speaking...");
	}
}
//child class
class Student extends Person1{
	
	//addition attribute
	String Grade = "Grade A";
	
	public void study() {
		System.out.println("Student is studying...");
		System.out.println("Student Name : "+name );
		System.out.println( "Student Grade: " + Grade);
	}
}

public class Inheritance_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj = new Student();
		obj.speak();
		obj.study();

	}

}
