package hibernate.com.hibernate.jsp.demo;

import java.util.Scanner;
class MainArmstrong{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(isArmstrong(n)) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
	}

	static boolean isArmstrong(int n){
		int temp=n;
		int sum=0;
		int nod=nodig(n);
		do{
			int k=n%10;
			sum=sum+pow(k,nod);
			n=n/10;
		}while(n!=0);
		return temp==sum;
	}
	static int nodig(int n){
		int count=0;
		do{
			count++;
			n=n/10;
		}while(n!=0);
		return count;
	}
	static int pow(int n,int p){
		int res=1;
		while(p>0){
			res=res*n;
			p--;
		}
		return res;
	}
}
