package Section01;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		if (n % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

	}

}
