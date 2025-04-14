package java1;

import java.util.Iterator;
import java.util.Vector;

public class VectorClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> v = new Vector<String>();
	
		
		v.add("Suyesh");
		v.add("Ajay");
		v.add("Mahesh");
		v.add("Yogesh");
		v.add("Sunita");
		v.add("Raj");
		
		System.out.println("Students Name: "+v);
		
        Vector<Integer> v1 = new Vector<Integer>();
	
		
		v1.add(101);
		v1.add(103);
		v1.add(123);
		v1.add(105);
		v1.add(104);
		v1.add(110);
		
		System.out.println("Student Roll No.: "+v1);
		
		/*Iterator<Integer> itr=v1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/

		
		
		

	}

}

/* OUTPUT
 
   Students Name: [Suyesh, Ajay, Mahesh, Yogesh, Sunita, Raj]
   Student Roll No.: [101, 103, 123, 105, 104, 110]
*/
