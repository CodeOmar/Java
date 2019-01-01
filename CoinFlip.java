/*
Omar Aguirre
Coin flip
12-5-18 
 */
import java.util.Scanner; 
public class CoinFlip {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		int toss = 0; 
		int head = 0;
		int tail = 0; 
		boolean result = flip(); 
		
		System.out.println("1. Toss coin\n0. Exit");
		toss = input.nextInt();
		System.out.println("Choice: " + toss);
		
		while(toss != 0) { 
		if (toss > 1) {
			System.out.println("Invalid. Select 1 to toss coin\n");
		}	
		else if (flip()) {
			head++;
		    System.out.printf("Heads: %d,  Tails: %d\n",head,tail);
		}
		else{
			tail++; 
			System.out.printf("Heads %d,  Tails %d:\n",head,tail);
			}
		
			System.out.println("1. Toss coin\n0. Exit");
			toss = input.nextInt(); 
			System.out.println("Choice: " + toss);
		
   }// while loop 
		System.out.printf("Total: Heads %d,  Tails: %d", head,tail);		
  }//main	
	public static boolean flip() {
		int toss = (int) (1 + Math.random() * 2); 
		if (toss == 1)
			return true;
		else 
			return false; 
		
 }// boolean
}//class

/*
1. Toss coin
0. Exit
1
Choice: 1
Heads 0,  Tails 1:
1. Toss coin
0. Exit
1
Choice: 1
Heads 0,  Tails 2:
1. Toss coin
0. Exit
1
Choice: 1
Heads: 1,  Tails: 2
1. Toss coin
0. Exit
1
Choice: 1
Heads 1,  Tails 3:
1. Toss coin
0. Exit
0
Choice: 0
Total: Heads 1,  Tails: 3
*/