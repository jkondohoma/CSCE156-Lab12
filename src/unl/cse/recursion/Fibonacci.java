package unl.cse.recursion;

public class Fibonacci {

	public int fibonacci(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String args[]) {

		Fibonacci f = new Fibonacci();
		int result, n = 45;

		long start, end;
		start = System.nanoTime();
		result = f.fibonacci(n);
		end = System.nanoTime();

		double ms = (end - start) / 1000000.0;

		System.out.println("fibonacci(" + n + ") = " + result);
		System.out.println("execution time = " + ms + "ms");

	}
}
