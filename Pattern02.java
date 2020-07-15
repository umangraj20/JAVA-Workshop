package Section01;

import java.util.Scanner;

public class Pattern02 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n = scn.nextInt();
		int nst=1;
		//row
		int row=1;
		while(row<=n) {
			//work
			int cst=1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
				
			}
			//prep
			System.out.println();
			row++;
			nst++;
		}
		

	}

}
