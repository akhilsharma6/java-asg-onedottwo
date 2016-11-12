class PrintResult {
	public static void main (String[] args)
	{
		int a = 20;
		int b = 10;
		System.out.println("Initial value of a is " + a);
		System.out.println("Initial value of b is " + b);

		System.out.println();
//
		b = a-- - --a; // Cannot declare b again as it's already declared above with value 10.
		System.out.println("Result of expression `int b = a-- - --a' is " + b);
		System.out.println();
//
		System.out.println("Now value of a is " + a);
		int c = a--;
		System.out.println("Result of expression `int c = a--' is " + c);
		System.out.println();
//
		System.out.println("Now value of a is " + a);
		int d = a>>2;
		System.out.println("Result of expression `int d = a>>2' is " + d);
		System.out.println();
//
		System.out.println("Now value of a is " + a);
		System.out.println("Now value of b is " + b);
		int e = a&b;
		System.out.println("Result of expression `int e = a&b' is " + e);
		System.out.println();
		System.out.println("Final value of a is " + a);
		System.out.println("Final value of b is " + b);
	}
}