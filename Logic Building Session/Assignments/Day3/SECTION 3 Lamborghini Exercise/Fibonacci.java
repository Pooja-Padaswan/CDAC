// 5.Write a program to print the Fibonacci sequence up to the number 21.

	public class Fibonacci{
	
		public static void main(String args[]){
		
				int n=9;
				int firstnum=0;
				int secnum=1;
				
				for(int i=0; i<=n; i++)
				{
					int Nextnum = firstnum+secnum;
					firstnum=secnum;
					secnum=Nextnum;
					
					System.out.println("Fibonacci sequence :" +Nextnum);
				}
			}
		}
				
/*
C:\Users\pooja\Desktop\AUG24-CDAC\Day3-CDAC\SECTION 2 Guess the Output>java Fibonacci
Fibonacci sequence :1
Fibonacci sequence :2
Fibonacci sequence :3
Fibonacci sequence :5
Fibonacci sequence :8
Fibonacci sequence :13
Fibonacci sequence :21
Fibonacci sequence :34
Fibonacci sequence :55
Fibonacci sequence :89				*/