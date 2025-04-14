package java1;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			int ans=10/0;
			  //int arr[]=new int[5];
			  //arr[10]=180;
		}
		
		/*catch(ArithmeticException e)
		{
			System.out.println(e);
		}*/
		catch(NullPointerException e)
		{
			System.out.println("Null pointer exception");
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException");	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");

		}
		catch(Exception e)
		{
			System.out.println("Global Exception");

		}
		finally
		{
			System.out.println("Finally block");
		}


	}

}

/* OUTPUT
   Global Exception
   Finally block

*/
