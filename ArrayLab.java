/*
Omar Aguirre
Array Lab 
12-2-18
 */ 
public class ArrayLab
{
   public static void main( String[] args )
   {
      int a= 0; 
      int b= 21;       
      int[][] arr=createArray(a,b) ;   // Don't change this line!
      
      printArray(arr);        // Don't change this line!           
      largestRow(arr);        // Don't change this line!
}
// end main
   
   public static int[][] createArray(int a, int b){
	int[][] arr = new int [3][4];
	for(int row = 0; row < arr.length; row++) {
		for(int coll = 0; coll < arr[row].length; coll++) 
			arr[row][coll] = (int)(Math.random() * (b-a)+1);
	}
	return arr; 
   }
   
   // method 2: print 2D array with one parameter which is a 2D array
   public static void printArray(int[][] arr){
 	for(int row = 0; row <arr.length; row++){
 		for(int coll = 0; coll < arr[row].length; coll++) {
 			System.out.printf("%d ", arr[row][coll]);
 		}
 		System.out.println();
 	}
   }
   	
   	// method 3: find out which row has the largest sum and print out the row # and the largest sum#
   	// with a 2D array as parameter

   	public static void largestRow(int[][] arr){
	int largest = Integer.MIN_VALUE;
	int index = 0; 
	for(int row = 0; row < arr.length; row++) {
		int total = 0; 
	for(int coll = 0; coll < arr[0].length; coll++) {
		total += arr[row][coll];
	}
	if (total>largest) {
		largest = total; 
		index = row; 
	   }
	  }
	System.out.println("Sum for row " +index + " is " + largest);
     }
   	
   	
} // end class Lab11
