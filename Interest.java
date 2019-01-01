
public class Interest {

	public static void main(String[] args) {
		double amount; 
		double principal = 1000.0;
		double rate = 0.05; 
		double rate2 = 0.06;
		double rate3 = 0.07;
		double rate4 = 0.08;
		double rate5 = 0.09;
		double rate6 = 0.10; 
		
		System.out.println("\nRate: 5.00 percent");
		System.out.printf("%s%20s\n", "Year", "Amount on deposit");
		
		for (int year = 1; year <= 10; year++) {
			
			amount = principal = Math.pow( 1.0 + rate, year);
			
			System.out.printf("%4d%,20.3f\n", year, amount);
					
		}
		
		System.out.println("\nRate: 6.00 percent");
		System.out.printf("%s%20s\n", "Year", "Amount on deposit");
		for (int year = 1; year <= 10; year++) {
			
			amount = principal = Math.pow(1.0 + rate2, year);
			
			System.out.printf("%4d%,20.3f\n", year, amount);
		}
		
		System.out.println("\nRate: 7.00 percent");
		System.out.printf("%s%20s\n", "Year", "Amount on deposit");
		for (int year = 1; year <= 10; year++) {
			
			amount = principal = Math.pow(1.0 + rate3, year);
			
			System.out.printf("%4d%,20.3f\n", year, amount);
		
		}
		System.out.println("\nRate: 8.00 percent");
		System.out.printf("%s%20s\n", "Year", "Amount on deposit");
		for (int year = 1; year <= 10; year++) {
			
			amount = principal = Math.pow(1.0 + rate4, year);
			
			System.out.printf("%4d%,20.3f\n", year, amount);
		
		}
		
		System.out.println("\nRate: 9.00 percent");
		System.out.printf("%s%20s\n", "Year", "Amount on deposit");
		for (int year = 1; year <= 10; year++) {
			
			amount = principal = Math.pow(1.0 + rate5, year);
			
			System.out.printf("%4d%,20.3f\n", year, amount);
		
		}
		
		System.out.println("\nRate: 10.00 percent");
		System.out.printf("%s%20s\n", "Year", "Amount on deposit");
		for (int year = 1; year <= 10; year++) {
			
			amount = principal = Math.pow(1.0 + rate6, year);
			
			System.out.printf("%4d%,20.3f\n", year, amount);
		
		}
		
		
 }
}
