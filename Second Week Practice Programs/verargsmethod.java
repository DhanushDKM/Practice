class verargsmethod
{	

	public static void method1(int...Student_id)
	{
		System.out.println("From ver args");
		
		//System.out.println(Student_id.length);
		
		for(int temp : Student_id)
		{
			System.out.print(temp +", ");
			System.out.println();
		}	
		
	}
	public static void main(String[]args)
	{
		method1(10);
		method1(10,20);
		method1(10,20,30);
		method1(10,20,30,40);
		method1(10,20,30,40,50);
		method1(10,20,30,40,50,70,60,40);
		
	}
	
	
}\