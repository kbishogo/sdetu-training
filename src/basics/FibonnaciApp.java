package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// Fibonnaci number is defined by the sum of the 2 previous fibonnaci numbers
		//fib(0) = 0
		//fib(1) = 1
		//fib(2) = fib(1) + fib(0) = 1 + 0 = 1
		//fib(3) = fib(2) + fib(1) = 1 + 1 = 2
		//fib(4) = fib(3) + fib(2) = 2 + 1 = 3
		//fib(5) = fib(4) + fib(3) = 3 + 2 = 5
		//fib(x) = fib(x-1) + fib(x-2)
		int i = 3;
		System.out.println("The sum of "+ i +  " is " + sumof(i));
		System.out.println("_________________________________________");
		System.out.println("The fib of "+ i +  " is " + fib(i));
		System.out.println("_________________________________________");
		System.out.println("The factorial of "+ i +  " is " + fact(i));
		System.out.println("_________________________________________");
		System.out.println("The sum of "+ i +  " is " + sumof(i));
		
		

	}
	
	public static int sumof(int n) {
		int localSum = 0;
		for (int i = n; i>=0; n--) {
		localSum = localSum + n;
		}
	
		return localSum;
			
		}
	
	public static int fib(int n) {
	if( n == 0) {
		
		return 0;
	}
	else if(n == 1){
		
		return 1;
		
	}
	
	return((fib(n-1)) + (fib(n-2)));
		
	}
	
	public static int fact(int n) {
		if( n == 0) {
			
			return 1;
		}
		else if(n == 1){
			
			return 1;
			
		}
		
		return(n * (n-1)*(n-2));
			
		}
	

}
 