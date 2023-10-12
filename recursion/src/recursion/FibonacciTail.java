package recursion;

public class FibonacciTail {
	
	public static long fib(int n){

		//System.out.println("enter1");
		return fib(n, 0, 1);
		
	}
	
	public static long fib(int n, int i, int j){
		//System.out.println("enter2");
		if (n == 0) {
			return i;
		} else if (n == 1) { 
			return j;
		} else {
			return fib(n-1, j, i+j);
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("This should be 89: " + fib(11)+ " ");
	}
}
