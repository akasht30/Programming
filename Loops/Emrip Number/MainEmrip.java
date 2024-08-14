package hibernate.com.hibernate.jsp.demo;


import java.util.Scanner;
class MainEmrip{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		if(isEmrip(n))
			System.out.println(n+" is a Emrip Number.");
		else
			System.out.println(n+" is not a Emrip Number.");
	}
	static boolean isEmrip(int n){
		return isPrime(n) && isPrime(rev(n)) && n!=rev(n);
	}
	static boolean isPrime(int n){
		if(n==0||n==1)
			return false;
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	static int rev(int n){
		int rev=0;
		do{
			int k=n%10;
			rev=rev*10+k;
			n=n/10;
		}while(n!=0);
		return rev;
	}
}
