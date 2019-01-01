/*
Omar Aguirre
Calculator
12-2-18 
 */
import java.util.Scanner; 
public class Calculator{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Input first number: ");
		int a = input.nextInt();
		System.out.println("Input second number: ");
		int b = input.nextInt();
		int c; 
		
		do {
			System.out.println("Enter 1 for addition\n" + "Enter 2 for subtraction\n" +
			"Enter 3 for multiplication\n" + "Enter 4 for division\n" +	"Enter 0 to exit");
			c = input.nextInt();
	
		if( c == 1) {
			add(a,b);   
		}
		else if (c == 2) {
			sub(a,b);
		}
		else if (c == 3) {
			multi(a,b);
		}
		else if (c == 4) {
			div(a,b);
		}
		else 
			System.exit(0);
		
		}
		while (c != 0); 
	}

	public static void add(int a, int b) {
		int sum = a + b;	
		System.out.println("Addition: "+sum); 
	}
	public static void sub(int a, int b) {
		int sum = a - b;  
		System.out.println("Subtraction: "+sum); 
	}
	public static void multi(int a, int b) {
		int sum = a * b; 	
		System.out.println("Multiplication: "+sum); 
	}
	public static void div(int a, int b) {
		double sum = a / (float) b; 
		System.out.println("Division: "+sum); 
	} 
}