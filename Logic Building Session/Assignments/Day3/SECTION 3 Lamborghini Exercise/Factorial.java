//Write a program to compute the factorial of the number 10.

public class Factorial{
	
			public static void main(String args[]){
			
				int num=10;
				int fac =1;
				
				for(int i=1; i<=num; i++)
				{
					fac *= i;
				}
					System.out.println("Factorial of 10 no. = " +fac);
			}
	}
					
					// output is : Factorial of 10 no. is = 3628800