class ExStaticVar
{

	static int k=100;
	public static void main(String[]args)
	{
			int k=10;
			
			StaticVar.charvalue = 'K';
			System.out.println("local variable value : " +k);
			System.out.println("local variable value : " +StaticVar.value);
			
			method1();
			System.out.println("local variable value : " +k);
	}
	
	public static int method1(){
		
		System.out.println("From method1");
		
		return 200;
			
	}


}