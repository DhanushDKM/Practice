import java.util.*;
class tenaryop
{		
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr your age ");
		int age = sc.nextInt();		
		String Result = (age > 50)? (age>100)?"Greater 100":
						(age>80)?"greater 80":"between 50 to 80":
						(age<10)?"lessthan 10 ":
						(age<20)?"lessthan20":"lessthan 20-50";		
		System.out.println(Result);
	
		
		
	}
}