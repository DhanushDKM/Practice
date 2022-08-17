class MethOvrLd
{
	public static void method1()
	{
		System.out.println("From method1 No param");
		
	}	
	public static void method1(int i)
	{
		System.out.println("From method1 1 param "+i );
		
	}	
	
	public static void method1(String i)
	{
		System.out.println("From method1 1 String param "+i );
		
	}		
	public static void method1(int i,String name)
	{
		
		System.out.println(i+", "+name);
	}
	public static void method1(int i,String name,int age)
	{
		System.out.println(i+", "+name+", "+age);
		
	}
	public static void method1(int i,String name,int age,int Marks1)
	{
		
		System.out.println(i+", "+name+", "+age+", "+Marks1);
	}
	public static void method1(int i,String name,int age,int Marks1,int Marks2)
	{
		System.out.println(i+", "+name+", "+age+", "+Marks1+", "+Marks2);
		
	}
	public static void main(String[]args)
	{
		int i=10;
		String name="java";
		int age=30;
		int Marks1=100;
		int Marks2=200;		
		System.out.println("From Main Begin");		
		method1();
		method1(i);
		method1(name);
		method1(i,name);
		method1(i,name,age);
		method1(i,name,age,Marks1);
		method1(i,name,age,Marks1,Marks2);	
		
	}
	
}