// 6.Write a program to find and print the first 5 prime numbers.
	public class Prime{
	
		public static void main(String args[]){
				int num=6;
				int count = 0;
				for(int i=1; i<=num; i++){
					if(num%i ==0)
						count++;
					}
				if(count==2){
					System.out.println("Prime");
					}
					else{
						System.out.println("Not prime" );
					}
				}
			}
		
		//output is  2
					 3
					 5
		// Prime no. is divided by only 1 or no. itself.

		
				
		
			
	
	