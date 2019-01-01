import java.util.Scanner; 
public class ShippingCost {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter shipping weight: ");
		int weight = input.nextInt();
		int cost = 0; 
		
		if (weight > 50)
			System.out.println("The package cannot be shipped");
		
		else {
			
			if(weight > 0 && weight <= 1)
					cost = 4;
			else if (weight > 1 && weight <= 3)
					cost = 6;
			else if (weight > 3 && weight <= 10)
					cost = 9;
			else if (weight > 10 && weight <= 50)
					cost = 11;
	System.out.printf("The shipping cost is: %d" ,cost);
			
		}	
	}
}
