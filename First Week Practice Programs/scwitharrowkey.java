import java.util.*;
class scwitharrowkey
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		switch(num)
		{
			case 5->System.out.println("Printing 5");
			case 10->System.out.println("Printing 10");
			case 15->System.out.println("Printing 15");
			case 20->System.out.println("Printing 20");	
		default->System.out.println("Invalid");
		}	 
	}
}	