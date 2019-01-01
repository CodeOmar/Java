/*
 Omar Aguirre
 Assignment: Tax Project
 11-14-18 
 */

import java.util.Scanner; 
public class TaxReturnTable {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		
		double due = 0;
		System.out.println("===================================");
		System.out.println("Enter number of clients: ");
		int clients = input.nextInt();
		int count; 
		
		for (count = 1; count <= clients; count++) {
		System.out.printf("Client #%d - \n", count);
		
		System.out.println("Enter 0 for single filers, 1 for married filing jointly, "
				+ "2 for married filing separately, and  3 for head of household");
		int status = input.nextInt();
	
		if (status >=4 ) {
			System.out.println("Wrong filing status! Please input a valid status.");
			System.exit(4);
		}
		
				else {
		
						System.out.println("Enter the taxable income: ");
						double income = input.nextDouble(); 
		 
							switch (status){
								case 0:// filing single
			
									if (income <= 8350)
										due = income * 0.10; 
			
									else if (income <= 33950)
										due = 8350 * 0.10 + (income - 8350) * 0.15;
			
									else if (income <= 82250)
										due = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25; 
			
									else if (income <= 171550)
										due = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
			
									else if (income <= 372950)
										due = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + 
										(income - 171550) * 0.33;
		
									else 
										due = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + 
										(372950 - 171550) * 0.33 + (income - 372950) * 0.35;
									break;
		
								case 1://married filing jointly or qualified widow
									if (income <= 16700 ) 
										due = income * 0.10;
									
			
									else if (income <= 67900) 
										due = 16700 * 0.10 + (income - 16700) * 0.15; 
									
			
		
									else if (income <= 137050) 
										due = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
									
		
									else if (income <=208850) 
										due = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
									
									
									else if (income <= 372950) 
										due = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + 
												(income - 208850) * 0.33;
									
		
									else  
											due = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + 
												(372950 - 20885) * 0.33 + (income - 372950) * 0.35;
									
									break;
		
								case 2://married filing separately
									if (income <= 8350 ) 
										due = income * 0.10;
									
									else if (income <= 33950) 
										due = 8350 * 0.10 + (income - 8350) * 0.15; 
									
			
									else if (income <= 68525) 
										due = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25; 
									
									else if (income <=104425) 
										due = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (income - 68525) * 0.28; 
									
									else if (income <= 186475) 
										due = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + 
												(income - 104425) * 0.33; 
									
									else  
										due = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + 
												(186475 - 104425) * 0.33 + (income - 186475)* 0.35; 
									
									break;
		
								case 3: // head of household
									if (income <= 11950 ) 
										due = income * 0.10;
									
									else if (income <= 45500) 
										due = 11950 * 0.10 + (income - 11950) * 0.15; 
									
			
									else if (income <= 117450) 
										due = 11950 * 0.10 + (45500 - 11950) * 0.15 + (income - 45500) * 0.25; 
									
									else if (income <=190200) 
										due = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (income - 117450) * 0.28; 
									
									else if (income <= 372950) 
										due = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 +
												(income - 190200) * 0.33; 
									
									else 
										due = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 +
												(372950 - 190200) * 0.33 + (income - 372950) * 0.35; 
									
									break;
		
									default: {
										System.out.println(); 
									}
		
							}// end of switch 	
			
	System.out.println();
	System.out.printf("Tax for Client #%d is %6.2f\n",count, due);
	System.out.println("===================================");
		
				}// end of else 	
		}//end of for
 }
}
/*
===================================
Enter number of clients: 
2
Client #1 - 
Enter 0 for single filers, 1 for married filing jointly, 2 for married filing separately, and  3 for head of household
0
Enter the taxable income: 
100000

Tax for Client #1 is 21720.00
===================================
Client #2 - 
Enter 0 for single filers, 1 for married filing jointly, 2 for married filing separately, and  3 for head of household
1
Enter the taxable income: 
300339

Tax for Client #2 is 76932.87
===================================
 */









