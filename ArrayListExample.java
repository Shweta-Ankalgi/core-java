package java1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(45);
		al.add(31);
		al.add(40);
		al.add(86);
		al.add(35);
		
		System.out.println("ArrayList Elements:"+al);
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		al.addFirst(20);
		al.addLast(90);
		System.out.println("Clone:"+al.clone());
		
		System.out.println(al);

		
	}

}
