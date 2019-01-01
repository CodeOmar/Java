
public class Triangles {


	public static void main(String[] args) {
		//first triangle 
		for (int i=1; i<=10;i++) {
			for (int j=1;j<=10;j++) {
				if (j<=i)
					System.out.print("*");
			}
		System.out.println(); 
		}
		//second triangle 
		System.out.println();
		for (int i=1;i<=10;i++) {
			for (int j=1; j<=10;j++) {
				if (j>=i)
					System.out.print("*");
			}
		System.out.println();
		}
		
		//third triangle 
		System.out.println();
		
		for(int i=1;i<=10;i++) {
			for (int j=1;j<=10;j++) {
				if (j<=i)
					System.out.print(" ");
				else 
					 System.out.print("*");
			}
		System.out.println(); 
		}
		
		//fourth triangle 
		for (int i=1;i<=10;i++) {
			for (int j=10; j>=1;j--) {
				if (j>i)
					System.out.print(" ");
				else 
					System.out.print("*");
			}
		System.out.println();
		}
		
	
 }		
}	