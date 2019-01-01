/*
 Omar Aguirre 
 isEven
 12-2-18
 */
import java.util.Scanner;  
public class isEven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter number to create a list: ");
		int num = input.nextInt(); 
		
		for (int i = 1; i <= num; i++) { 
		boolean result = boo(i); 
		if (result == true) {
			System.out.println(i + " Is even");
		}
		else 
			System.out.println(i + " Is not even");
	  }//for loop 
	 }// body
	
	public static boolean boo (int i) {
		boolean m; 
		if (i % 2 == 0)
			m = true;
		else m = false;
		return m;
	}//body 
}//main