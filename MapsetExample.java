package java1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m = new HashMap();
		
		m.put(1, "Hey");
		m.put(2, "Hello");
		m.put(3, "Madhuri");
		m.put(4, "Vishal");
		m.put(5, "Aniket");
		m.put(6, "Anuradha");
		m.put(4, "Naksha");
		
		System.out.println(m);
		
		Set s=m.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		while(it.hasNext())
		{
			Map.Entry e=(Map.Entry)it.next();
			System.out.println(e.getKey()+" "+e.getValue());
			
		}
		

	}

}
