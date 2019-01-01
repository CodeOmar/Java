/*
 Omar Aguirre 
 Determinant
 12-4-18
 */
import java.util.Scanner; 
public class Determinant {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[][] m = new int[2][2]; 
			  
		System.out.println("Enter four values: ");
		for(int i = 0; i <2;i++) {
			for (int j = 0; j < 2; j++) { 
				m[i][j]=input.nextInt(); 
			   }
		   }
		System.out.println("Matrix:");
		for(int[] array : m) {
			for(int i : array)
				System.out.print(i + " ");
			    System.out.println();
		   }
		System.out.println();
		
		int det = m[0][0] * m[1][1] - m[0][1] * m[1][0]; 
		System.out.println("The determinant is " + det);    
 }
}

/*
Enter four values: 
1
2
3
4
Matrix:
1 2 
3 4 
The determinant is -2 
*/
 