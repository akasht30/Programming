package arrays;

import java.util.Arrays;

public class ProdEqualsSumPair {

	public static void main(String[] args) {
		int[] ar= {9 ,8 ,3 ,-7 ,3 ,9};


		System.out.println(getProd(ar,9));

	}

	static int getProd(int[] ar,int sum) {


		Arrays.sort(ar);
		for(int i=0;i<ar.length;i++) {

			int b1=ar[0]+ar[1];

			if(b1<sum) {
				int prod=ar[0]*ar[1];
				return prod;
			}
		}
		return 0;

	}
}
