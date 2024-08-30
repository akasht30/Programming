package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class SumEvenNthandOddNS {

	public static void main(String[] args) {
		int[] ar= {3,2,1,7,5,4};
		
		System.out.println(getSum(ar));
		
	}
	
	static int getSum(int[] ar) {
		ArrayList<Integer> al1=new ArrayList<Integer>();
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al1.add(ar[0]);
		
		for(int i=1;i<ar.length;i++) {
			if(i%2==0)
				al1.add(ar[i]);
		
			else
				al2.add(ar[i]);
		}
		

		Collections.sort(al1,Collections.reverseOrder());
		Collections.sort(al2,Collections.reverseOrder());
		
		int b1=al1.get(1);
		int b2=al2.get(1);
		
		return b1+b2;
	
	}
	
}
