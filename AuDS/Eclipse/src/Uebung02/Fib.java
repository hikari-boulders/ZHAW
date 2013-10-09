package Uebung02;

public class Fib {
	
	public static void main(String [ ] args){
		
		for(int i=0;fib(i)<4000000;i++){
			if(fib(i)%2 == 0) {
				System.out.println(fib(i));
			}
		}
		
	}
	
	public static int fib(int n) {
		if(n<2) {
			return n;
		} else {
			return fib(n-1) + fib(n-2);
		}
	}
}

