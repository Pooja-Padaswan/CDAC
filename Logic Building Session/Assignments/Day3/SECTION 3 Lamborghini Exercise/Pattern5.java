/*16. Write a program to print the following pattern:
*
***
*****
*******
*********

*/



		public class Pattern5{
			public static void main(String args[]){
			
				for(int i=1; i<=9; i++)
					{
						if(i%2==1){
							for(int j=1; j<=i; j++)
						
						{
							System.out.print(" *");
						}
						}
							System.out.println(" ");
					}
				}
			}
		  