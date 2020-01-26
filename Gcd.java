import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner (System.in);
		int divident= scn. nextInt();
		int divisor= scn. nextInt();
		
//		we will keep doing this task till remainder comes to 0.
		while (divident% divisor!=0) {
			int rem= divident% divisor;
//			updating your values
			divident =divisor;
			divisor=rem;
		}
		System.out.println(divisor);
	}

}
