package loops;

public class Fibonacci {
	static void fibonS(int n) {
		int l=0,k=1;
		for(int i=1;i<=n;i++) {
			System.out.println(l+" ");
			
			int sum=l+k;
			l=k;
			k=sum;
		}
	}
	public static void main(String[] args) {
		int n=5;
		fibonS(n);
		
	}
}
