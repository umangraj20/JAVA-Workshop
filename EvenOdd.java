import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
//		Here we import the input from the user by this Scanner
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
//		here we check the even or odd statement 
		
		if(n%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
		

	}

}
