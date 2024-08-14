import java.util.Scanner;
class MainEmripN{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number : ");
int n=sc.nextInt();
printEmripN(n);
}
static void printEmripN(int n){
for(int i=1;i<=n;i++){
if(isEmrip(i))
System.out.println(i);
}
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
