package recursion;


public class Driver {

	static boolean isPal(String s) {

		// write your code
		return isPal(s, 0, s.length() - 1);

	}

	private static boolean isPal(String s, int low, int high) {

		// write your code
		if (high <= low) // Base case
			return true;
		else if (s.charAt(low) != s.charAt(high)) // Base case
			return false;
		else
			return isPal(s, low + 1, high - 1);

	}
	
	public static void main(String[] args) {

		String str1 = "SUJIN LEE";
		String str2 = "12321";

		System.out.println("This should be false: " + isPal(str1));
		System.out.println("This should be true: " + isPal(str2));
	}
}
