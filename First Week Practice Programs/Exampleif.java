mport java.util.*;
class Exampleif
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the person Age - : ");
		int age = sc.nextInt();
		if(age < 50)
		{
			if(age < 30)
			{
				if(age < 15)
				{
					System.out.println("Age is less than 15");
				}
				else
				{
				System.out.println("Age is between 15 to 30");
				}
				
			}
			else{
				System.out.println("age is 30 to 50");
			}
			
		}
		else if(age < 70)
		{
			if(age < 60)
			{
				System.out.println("Age is 50 to 60 ");
			}
			else{
				System.out.println("Age is 60 to 70 ");
			}
			
			
		}
		else
		{
			System.out.println("your age is greater than 70");
			
		}
		
				
	}
	
}