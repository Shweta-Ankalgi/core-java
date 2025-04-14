package java1;

public class Autoboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//primitive data type: int,float,char,double,long,byte,boolean,short
		
		System.out.println("Autoboxing");
		
		int var1=50;
		Integer i=Integer.valueOf(var1);
		System.out.println(i);
		
		float var2=8;
		Float f = Float.valueOf(var2);
		System.out.println(f);
		
		
		char var3 = 'h';
		Character c = Character.valueOf(var3);
		System.out.println(c);
		
		double var4 = 9;
		Double d = Double.valueOf(var4);
		System.out.println(d);
		
		
		long var5 = 9;
		Long l = Long.valueOf(var5);
		System.out.println(l);
		
		byte var6 = 5;
		Byte b = Byte.valueOf(var6);
		System.out.println(b);
		
		boolean var7 = true;
		Boolean bl = Boolean.valueOf(var7);
		System.out.println(bl);
		
		short var8 = 100;
		Short s = Short.valueOf(var8);
		System.out.println(s);
		

	}

}

/*
Output
8.0
h
9.0
9
5
true
100
 
 */
