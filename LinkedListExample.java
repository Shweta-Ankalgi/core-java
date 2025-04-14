package java1;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Hey");
		ll.add("How");
		ll.add("Was");
		ll.add("your");
		ll.add("exams");
		ll.add("good luck");
		System.out.println("Linked List elements:"+ll);
		System.out.println("Size :"+ll.size());
		
		System.out.println("Contain method: "+ll.contains("Your"));
		
	

	}

}
