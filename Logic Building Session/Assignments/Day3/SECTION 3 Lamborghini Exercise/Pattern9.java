//1//9. Write a program to print the following pattern:

public class Pattern9 {
    public static void main(String[] args){
        for (int i = 5; i >= 1; i--) { 
        for (int j = 5; j >= i; j--) { 
                System.out.print(j); 
          if (j > i) {
                    System.out.print("*"); 
                }
            }
            System.out.println(); 
        }
    }
}
