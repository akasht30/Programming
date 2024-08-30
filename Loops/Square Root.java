package Numbers;

import java.net.Socket;
import java.util.Scanner;

public class Sqrt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		double s=sqrt(n);
		System.out.println(s);
	}
	static double sqrt(int n) {
		double temp;
		double sq=n/2;
		do {
			temp=sq;
			sq=(temp+(n/temp))/2;
			
		}while(sq-temp!=0);
		return sq;
		
	}

}
