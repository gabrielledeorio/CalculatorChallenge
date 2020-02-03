import java.util.Scanner;

public class CalculatorChallenge
{

static boolean calculating= true; 
static Scanner userIntInput;
static Scanner userStringInput;
static int num1;
static int num2;
static String operation;
		public static void main (String [] args)
			{
			userStringInput = new Scanner (System.in);
			userIntInput= new Scanner (System.in); 
			System.out.println("Give me your first number");
			int num1 =userIntInput.nextInt();
			System.out.println("Give me your second number");
			int num2= userIntInput.nextInt();
			System.out.println("Type in operation");
			String operation= userStringInput.nextLine();
			
			if (operation.equals ("add"))
				{
					
					System.out.println(add(num1,num2));
				}
			else if (operation.equals ("multiply"))
				{
					
					System.out.println(multiply(num1,num2));
				}
			else if (operation.equals ("divide"))
				{
					
					System.out.println(divide(num1,num2));
				}
			else if (operation.equals ("subtract"))
				{
					
					System.out.println(subtract(num1,num2));
				}
			else if (operation.equals ("exponent"))
				{
					
					System.out.println(exponent(num1,num2));
				}
			}
		
		public static int add(int x, int y)
		{
			return x + y;
		}
		public static int multiply (int x, int y)
		{
			return x*y;
		}
		public static int divide(int x, int y)
		{
			return x/y;
		}
		public static int subtract (int x, int y)
		{
			return x-y;
		}
		public static double exponent (int x, int y)
		{
			return (Math.pow (x,y));
		}

}
