package java1;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try
		{
			int x = 6/0;
			
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		System.out.println("Heii");

	}

}


/* OUTPUT
   java.lang.ArithmeticException: / by zero
   Heii

*/