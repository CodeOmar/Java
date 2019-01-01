/*
Omar Aguirre
Commissions
12-5-18
*/
import java.util.Scanner; 
public class Commissions {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	  int [] num = new int [9];           
      int index;
      int i; 
      double salary;
       
      System.out.print("Enter total sales people: ");                           
      int people =input.nextInt();
       
      for(i = 1;i <= people; i++) {
    	  System.out.print("Salespeople "+i+" enter sales: ");
          int sales=input.nextInt();
          salary=200+(int)(.09*sales);
          System.out.printf("Salary=$%.2f\n",salary);
          index=(int)salary/100-2;
           
          if(index > 8)
             index = 8;
             num[index]++;
  }//for loop 
      
        System.out.println("\nSales\t\tCount");
        for(i=0;i<8;i++) 
        System.out.println("$"+(i*100+200)+"-"+(i*100+299)+"\t" +num[i]);
        System.out.println("$1000 and over\t"+num[i]);
        
 }//body                              
}//main

/*
Enter total sales people: 2
Salespeople 1 enter sales: 5000
Salary=$650.00
Salespeople 2 enter sales: 6000
Salary=$740.00

Sales		Count
$200-299	0
$300-399	0
$400-499	0
$500-599	0
$600-699	1
$700-799	1
$800-899	0
$900-999	0
$1000 and over	0
*/