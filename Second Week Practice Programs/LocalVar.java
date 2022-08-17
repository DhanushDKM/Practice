class LocalVar
{	
    /*
		1.  instance variable (Non-static variable)
		2.  static variable(class level variable)
		3.  local variable 
				1. local variable fields are sored in stack memmory
				2. for local variablue initialization is must
				3. loacal variable aslo call as temp
				4. LV are only visible on particular methods or controls or constructors 
	*/

	public static void main(String[]args)
	{
		int value=10;
		
		if(false)
		{
			int i=10;//local variable
			System.out.println(i);
		}
		else{
			short s1 =100;
			System.out.println("Not printlng" +value);
		}
		
		method1(200);
			
	}

	public static void method1(int Z)
	{
		System.out.println(Z);
	}

}