//Snippet2
public class DecrementingLoop {
		public static void main(String[] args) {
			int total = 0;
			for (int i = 5; i > 0; i--) {
				total += i;
					if (i == 3) continue;
					total -= 1;
				}
					System.out.println(total);
			}
		}
// Guess the output of this loop.
11







/*



public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue; // Skip the rest of the loop body if i is 3
            System.out.println(i);
        }
    }
}
Output 
		1
		2
		4
		5
*/