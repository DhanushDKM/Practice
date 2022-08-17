class StaticVar
{
	/*
		1.	using static key words can able to create static variable
		2.	static variable is also called as class level variable
		3.	for static initialization is not mandatary if initialization not happen comiler it's self provide default value
		4. static variable can be access from any place outside of class and outside of package 
		5. static members are stroed in heap memmory
	*/
	/*
		Default value
		int,byte,short,long -->0
		String --> null
		char --> emptyspace
		flot,double-->0.0
		boolean -->false 
		object --> null
	*/
	
	static int value=100; // static variable or class level variable  
	static String stringValue="Raja";
	static boolean booleanValue=true;
	static char charvalue;
	static double doublevalue;
	static float floatvalue;
	
	public static void main(String[]args)
	{
		int i=10;		
		String stringValue ="anudip";//local 		
		System.out.println(value);
		System.out.println(stringValue);
		System.out.println(booleanValue);
		System.out.println(charvalue);
		System.out.println(doublevalue);
		System.out.println("float val"+floatvalue);		
		method1();
		method2();
	}
	
	public static void method1()
	{
		System.out.println(value);
		System.out.println(stringValue);
		System.out.println(booleanValue);
		System.out.println(doublevalue);	
	}
	
	public static void method2()
	{
		System.out.println(value);
		System.out.println(stringValue);
		System.out.println(charvalue);
		System.out.println(doublevalue);	
	}
}