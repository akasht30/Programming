//Print n number of Armstrong number
import java.util.Scanner;
class MainMNArmstrong{
        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter the starting number: ");
                int m=sc.nextInt();
                System.out.print("Enter the ending number: ");
                int n=sc.nextInt();
                printArmstrong(m,n);
        }
        static void printArmstrong(int m,int n){
              for(int i=m;i<=n;i++){
                    if(isArmstrong(i)){
                          System.out.println(i);
                    }
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
