import java.util.Scanner; 
public class Count {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insert five integers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		int neg = 0; 
		int pos = 0;
		int zer = 0; 
		
		if (a < 0)
			neg = neg +1;
		if (b < 0)
			neg = neg +1;
		if (c < 0)
			neg = neg +1;
		if (d < 0)
			neg = neg +1;
		if (e < 0)
			neg = neg +1;
		System.out.printf("There are %d negative numbers" ,neg);
		
		if (a > 0)
			pos = pos +1;
		if (b > 0)
			pos = pos +1;
		if (c > 0)
			pos = pos +1;
		if (d > 0)
			pos = pos +1;
		if (e > 0)
			pos = pos +1;
		System.out.printf("\nThere are %d positive numbers" ,pos);
		
		if (a == 0)
			zer = zer +1;
		if (b == 0)
			zer = zer +1;
		if (c == 0)
			zer = zer +1;
		if (d == 0)
			zer = zer +1;
		if (e == 0)
			zer = zer +1;
		System.out.printf("\nThere are %d zeros" ,zer);
		
		
		
	}

}
