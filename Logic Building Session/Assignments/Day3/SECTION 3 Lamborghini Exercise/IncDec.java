// 11. 11. Write a Java program to demonstrate the use of both pre-increment and post-decrement
//operators in a single expression

	public class IncDec{
			public static void main(String args[])
			{
				int a=5;
				int b=3;
				int i=1;
					a = ++i - a++ - i-- + b-- + --a + ++b;
				
			System.out.println("Value of a and b is = " + a + " " + b);

			}
	}