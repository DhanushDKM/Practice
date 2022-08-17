class Obeject
	/*
		create object
		
		--> Using new keyword we can create objects for particular class
		
		--   ClassName identifier = new ClassName();  syntax of creating objects
	
	*/
{
    double Value;
	public static void main(String[]args)
	{	
		O obj = new O();
		
		O obj1 = new O();
		
		O obj2= new O();
		
		O obj3 = new O();
		
		obj3.Value=500.70;
		
		O obj4 = obj;
		
		
		O obj5 = obj1;
		obj.Value=100.200;
		System.out.println(obj.Value);
		
			System.out.println(obj);
			System.out.println(obj1);
			System.out.println(obj2);
			System.out.println(obj3);
			System.out.println("=========================");
			System.out.println(obj4);
			System.out.println(obj5);
			
			System.out.println(obj3.Value);
			System.out.println(obj.Value);//
			System.out.println(obj4.Value);
	}
	
}