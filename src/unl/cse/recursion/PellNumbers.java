package unl.cse.recursion;

import java.math.BigInteger;

public class PellNumbers {

	private static final BigInteger TWO = new BigInteger("2");

	public static BigInteger PellNumber(Integer n) {
		if (n == 0) {
			return BigInteger.ZERO;
		} else if (n == 1) {
			return BigInteger.ONE;
		} else {
			BigInteger a = PellNumber(n - 1);
			BigInteger b = PellNumber(n - 2);
			return a.multiply(TWO).add(b);
		}
	}

	public static void main(String args[]) {

		int n = 9;
		BigInteger p_n = PellNumber(n);
		System.out.printf("p(%d) = %s\n", n, p_n.toString());
	}
}
