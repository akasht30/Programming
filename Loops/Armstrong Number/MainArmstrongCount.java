import java.util.Scanner;
class MainArmstrongCount{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n=sc.nextInt();
	int res=countArmstrong(n);
	System.out.println(res);
	}
	static int countArmstrong(int n){
		int count=0;
		for(int i=1;i<=n;i++){
			if(isArmstrong(i)){
				count++;
			}
		}
		return count;
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