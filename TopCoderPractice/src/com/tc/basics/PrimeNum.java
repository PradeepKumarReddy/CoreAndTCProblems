package com.tc.basics;

public class PrimeNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] in = { 2, 3, 4, 5, 6 };
		for (int i=0; i< in.length ; i++) {
			if (primeNum(in[i])) {
				System.out.println(in[i]);
			}
		}
	}

	public static boolean primeNum(int n) {

		if (n <= 1)
			return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		int m = (int) Math.sqrt(n);

		for (int i = 3; i <= m; i += 2)
			if (n % i == 0)
				return false;

		return true;
	}

}
