/*
Omar Aguirre
Duplicate
12-4-18
*/
import java.util.Scanner; 
public class Duplicate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		int[] array = new int [5]; 
		int a = 0; 
		int d = 0; 
		
		do {
		System.out.println("Insert an integer: ");
		int num = input.nextInt(); 
		
		if(num > 9 && num < 101) {
			boolean b = false; 
			a++; 
		
			for(int i = 0; i < array.length; i++) {
				if (array[i] == num)
				b = true; 
			}
		
			if (!b) {
				array[d] = num; 
				d++; 
			}
			else 
				System.out.println("Integer was already entered!");
		}
		else 
			System.out.println("Invalid number!"); 
		
		for(int i = 0; i< a; i++) {
			if (array[i] != 0)
			System.out.print(array[i] + " ");  
		}
		System.out.println(); 
		}
		while (a < array.length);
 }//body
}// main

/*
Insert an integer: 
12
12 
Insert an integer: 
13
12 13 
Insert an integer: 
12
Integer was already entered!
12 13 
Insert an integer: 
14
12 13 14 
Insert an integer: 
15
12 13 14 15 
*/