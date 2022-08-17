class M
{
	/*
	default value will generate for non-static variable and static variable by JVM
	
	*/
	int Student_Id;
	boolean values;
	
	static String college_name;
	
	public static void main(String[]args)
	{
		
		int i=0;
		int j=0;
		
		
		
		M obj= new M(); //creating object
		System.out.println("======Non-Static=======");
		System.out.println(obj.Student_Id);
		obj.method1();
		System.out.println("======Static=======");
		System.out.println(college_name);
		method2();
		
		System.out.println(M.college_name);
		M.method2();
		
		
		System.out.println(obj.college_name);
		obj.method2();
		
		
	}
	
	public void method1()
	{
		System.out.println("Non -static method ");
	}
	public static void method2()
	{
		
		System.out.println(" -static method ");
	}
	
	


}