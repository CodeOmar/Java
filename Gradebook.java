public class Gradebook {
	public static void main(String[] args) {
		
		System.out.println("Test\tGrade");
		int sum = 0; 
		double average = 0; 
		int max = Integer.MIN_VALUE; 
		int min = Integer.MAX_VALUE; 
		int gradebook[]= {0,10,20,30,40,50,60,70,80,90,10,11,12,13,14,15,16,17,18,19}; 
		
		for (int counter = 0; counter < gradebook.length; counter++) {
			sum+=gradebook[counter]; 
			System.out.println(counter + "\t" + gradebook[counter]);
			average = 1.0d * sum/gradebook.length; 	 //calculate average 
	
			if (gradebook[counter] > max) { //calculate maximum 
			max = gradebook[counter]; 
			}
			if (gradebook[counter] < min) { //calculate minimum 
				min = gradebook[counter]; 
			}
  }//for loop 
		System.out.println("Sum is: " +sum);
		System.out.printf("Average is: %.2f\n" ,average);
		System.out.println("Max is: " +max);
		System.out.println("Min is: " +min);
 }//body 
}//main