import java.util.*;
class Inputprogram
{
	public static void main(String[]Sname)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your first value");
		
		int value1 =sc.nextInt();
		System.out.println("Enter your second value");
		int value2  =sc.nextInt();

		System.out.println("Value Calculation is : ");
		System.out.println("Additon :" + (value1 + value2)); 
		System.out.println("Subtraction :" + (value1 - value2));  
		System.out.println("Multiplication : "+(value1 * value2));
	}
}	