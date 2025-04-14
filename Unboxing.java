package java1;

public class Unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//primitive data type: int,float,char,double,long,byte,boolean,short
         System.out.println("Unboxing");
         
         
         Integer j=new Integer(90);
         int ans=j.intValue();//explicit conversion
         System.out.println(ans);
         		
         Float f = new Float(9);
         float a = f.floatValue();
         System.out.println(a);
		
         
         Character c = new Character('h');
         char a1 = c.charValue();
         System.out.println(a1);
         
         Double d = new Double(5);
         double a2 = d.doubleValue();
         System.out.println(a2);
         
         Long l = new Long(9);
         long a4 = f.longValue();
         System.out.println(a4);
         
         Byte b = new Byte((byte) 5);
         byte a5 = b.byteValue();
         System.out.println(a5);
         
         Boolean bl = new Boolean(true);
         boolean a6 = bl.booleanValue();
         System.out.println(a6);
         
         Short s = new Short((short) 1000);
         short a7 = s.shortValue();
         System.out.println(a7);
		
		

	}

}

/* 
Output
Unboxing
90
9.0
h
5.0
9
5
true
1000

*/
