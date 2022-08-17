class ExplicitReturn
{


	static double Value;
	
	static short shortValue;

	public static void main(String[]args)
	{ 
	
	
		System.out.println("Main End");
		
		
		int Value = method1();
		
		System.out.println(Value);
		
		      int shortValue=method2();
			  System.out.println(shortValue);
			  
			  String s1 = method3();
			  System.out.println(s1);
	}
	
	
	public static int method1()
	{
		 Value=400.40;
		//double Value1=400.40;
		
		//int Value=(int)Value1;
		
		return (int)Value;
	
	}
	
	public static int method2()
	{
		 shortValue=300;
		//double Value1=400.40;
		
		//int Value=(int)Value1;
		
		return shortValue;
	
	}
	
	public static int method3()
	{
		return "0";
	}
	
	
	
	

}