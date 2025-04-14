package java1;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeSet <Integer> ts=new TreeSet();
		ts.add(100);
		ts.add(99);
		ts.add(95);
		ts.add(10);
		
		System.out.println(ts);


		SortedSet<Integer> ss=new TreeSet();
		
		ss.add(34);
		ss.add(68);
		ss.add(90);
		ss.add(98);
		ss.add(75);
		ss.add(10);
		ss.add(44);
		
		System.out.println(ss);
		
		Iterator<Integer> itr=ss.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		
	}

}

/*  OUTPUT
    [10, 95, 99, 100]
   [10, 34, 44, 68, 75, 90, 98]
   10
   34
   44
   68
   75
   90
   98
    */
