import java.util.Scanner;

public class ElseIfDemo {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int age = scn.nextInt();
//		apply the elseif demo Question/statement here
		
		if(age<=11) {
			System.out.println("child");}
			else if (age>=12 && age<=17) {
				System.out.println("teenager");}
			else if (age>=18 && age<=60) {
				System.out.println("adult");}
			else {
				System.out.println("old");
		}
	}

}
