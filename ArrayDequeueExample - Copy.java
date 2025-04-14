package java1;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque<String> ad= new ArrayDeque<String>();
		
		ad.add("You Can Win");
		ad.add("Wings Of Fire");
		ad.add("Harry Potter");
		ad.add("Don Quixote");
		ad.add("Atomic Habits");
		System.out.println("Book Name: "+ad);
		
		ad.addFirst("1984");
		ad.addLast("The Lord of the Rings");
		
		
		System.out.println("Book Name: "+ad);
		
		System.out.println("Removing First Element From Queue: "+ad.removeFirst());
		System.out.println("Removing Last Element From Queue :"+ad.removeLast());
		
		System.out.println("Book Name: "+ad);
		
		
		Iterator<String> itr=ad.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}


/* OUTPUT
 
   Book Name: [You Can Win, Wings Of Fire, Harry Potter, Don Quixote, Atomic Habits]
   Book Name: [1984, You Can Win, Wings Of Fire, Harry Potter, Don Quixote, Atomic Habits, The Lord of the Rings]
   Removing First Element From Queue: 1984
   Removing Last Element From Queue :The Lord of the Rings
   Book Name: [You Can Win, Wings Of Fire, Harry Potter, Don Quixote, Atomic Habits]
   You Can Win
   Wings Of Fire
   Harry Potter
   Don Quixote
   Atomic Habits
 */
