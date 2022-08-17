import java.util.Scanner;
import java.util.*;
class ReturnType
{	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter your First value");//getting first value
			int value1 = sc.nextInt();
			System.out.println("Enter your First value");//second value
			int value2 = sc.nextInt();
			int add = Addition(value1,value2);  //pass the value for addition
			long multiply = Multiplication(value1,value2);
			double	divition =divition(value1,value2);
			int Sub=Subtraction(value1,value2);
			double Mod=	Modulus(value1,value2);
			
			
			Display(add,multiply,divition,Sub,Mod);
			
	}		
	public static int  Addition(int i,int j)
	{	
		int k = i+j;   //add two value 
		return k;
	}	
	public static long Multiplication(int i,int j)
	{
		long k = i*j;
		return k;
	}
	public static double divition(int i,int j)
	{
		int k = i/j;
		return k;
	}
	public static int Subtraction(int i,int j)
	{
		int k = i-j;
		return k;
	}	
	public static double Modulus(int i,int j)
	{
		int k = i%j;
		return k;
	}	
	public static void Display(int add,long Mul,double div,int sub,double Mod)
	{	
			System.out.println("Addition = "+add);
			System.out.println("Multiplication = "+Mul);
			System.out.println("Divition = "+div);
			System.out.println("Sub = "+sub);
			System.out.println("Modulus = "+Mod);
	}
	
	
	
	
} 