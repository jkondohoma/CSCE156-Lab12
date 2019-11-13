package unl.cse.recursion;

import java.util.Scanner;

public class Palindrome {

	public boolean isPalindrome(String s) {

		if (s.length() == 1 || s.isEmpty()) {
			return true;
		}

		if (s.charAt(0) == s.charAt(s.length() - 1)) {
			return isPalindrome(s.substring(1, s.length() - 1));

		}

		return false;
	}

	public static void main(String args[]) {

		boolean exit = false;

		Scanner s = new Scanner(System.in);
		Palindrome p = new Palindrome();
		while (!exit) {
			System.out.print("Enter a word: ");
			String str = s.next();
			System.out.println(str + " is a palindrome? " + p.isPalindrome(str));
			System.out.println();
			if (str.equalsIgnoreCase("exit")) {
				System.out.println("exiting.....");
				exit = true;
			}

		}
		s.close();
	}
}
