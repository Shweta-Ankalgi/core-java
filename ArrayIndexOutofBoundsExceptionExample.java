package java1;

public class ArrayIndexOutofBoundsExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
	      int arr[]=new int[5];
	       arr[10]=256;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	  System.out.println("hellooo.....");

	}

}

/* OUTPUT
 
   java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
   hellooo.....

*/
