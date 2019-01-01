/*
Omar Aguirre
Variable Length
12-4-18 
*/
public class VariableLength {
	public static void main(String[] args) {
		System.out.println(range(11,22,34,56));
 }
	public static int range(int...numbers){
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE; 
		int total = 0;

		for (int x: numbers) 
			if(x < min )
				min = x;
		for (int a:numbers)
			if( a > max)
				max = a; 
			int range = max - min; 
			
		for(int z:numbers) 
			total+=z;
		double average = 1.0d * total / numbers.length; 	
			System.out.printf("The average is: %.02f\n", average );
		
		for(int d = 0; d < numbers.length; d++)
			if(numbers[d] > average)
				System.out.println("Numbers more than average: " +numbers[d]);

	 System.out.print("The range is: "); 
	 return range; 
 }
}
/*
The average is: 30.75
Numbers more than average: 34
Numbers more than average: 56
The range is: 45
*/