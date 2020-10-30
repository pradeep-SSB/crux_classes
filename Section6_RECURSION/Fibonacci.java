package Section6_RECURSION;

public class Fibonacci {
	public static int Fibonacci(int N) {
//		if(N == 0  || N == 1) when 0th assume as- first element
//			return N;
		 
		if(N == 1  )
			return 0;
		if(N ==2)
			return 1;
		
		int fn1 = Fibonacci(N - 1); 
		int fn2 = Fibonacci(N - 2);
		int fn = fn1 + fn2;
		return fn;
	}

}
