// 5.Write a program to print the Fibonacci sequence up to the number 21.

	public class Fibonacci{
	
		public static void main{
		
				int n=9;
				int firstnum=0;
				int secnum=1;
				
				for(int i=0; i>=n; i++)
				{
					int Nextnum = firstnum+secnum;
					firstnum=secnum;
					secnum=Nextnum;
					
					System.out.println("Fibonacci sequence :" +Nextnum);
				}
			}
		}
					