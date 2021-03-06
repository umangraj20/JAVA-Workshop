package Lecture3;

public class FunctionDemo {
	
	public static int val=20;

	public static void main(String[] args) {
		// part 1 : Normal call

		System.out.println("part 1 : Normal call");

		System.out.println("Hello");
		// function call
		addition();
		System.out.println("bye");

		// part 2: Functions with parameters
		System.out.println("part 2: Functions with parameters");
		additionparams(10,20);
		additionparams(20,30);
		
		//Part:3 Function Return Value
		
		System.out.println("Part:3 Function Return Value");
		int sum=additionReturn(30,40);
		System.out.println(sum);
		
		//Part 4: Variable Scope
		
		System.out.println("Part 4: Variable Scope");
		int one=10;
		int two=20;
		int res = DemoScopes(one,two);
		System.out.println(res);
		
		//Part 5: Global Scope
		
		System.out.println("Part 5: Global Scope");
		System.out.println(val);
		int val=200;
		System.out.println(val);
		System.out.println(FunctionDemo.val);
		int ans= DemoGlobalScopes(one);
		System.out.println(ans);
		
		//Part 6: Block Scope
		
		System.out.println("Part 6: Block Scope");
		if(one<two) {
			int three=30;
			System.out.println(three);
		}
		
		//Part 7: Pass by Value
		
		System.out.println("Part 7: Pass by Value");
		System.out.println(one+","+two);
		swap(one,two);
		System.out.println(one+","+two);
		
	}
	public static void swap(int one, int two) {
		System.out.println(one+","+two);
		
		int temp=one;
		one=two;
		two=temp;
		System.out.println(one+","+two);
		
	}
	
	
	public static int DemoGlobalScopes(int one) {
		int sum= one + val;
		return sum;
		
	}
	
	public static int DemoScopes(int one, int another) {
		int sum= one + another;
		return sum;
	}
	
	public static int additionReturn(int  a,int b) {
		int sum=a+b;
		return sum;
	}
	public static void additionparams(int  a,int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	// function def.
	public static void addition() {
		int a = 10;
		int b = 5;
		int c = a + b;
		System.out.println(c);

	}

}
