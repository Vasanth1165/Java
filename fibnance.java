import java.util.*;
class recursion{
    public static void fibnance(int a,int b,int n){
        if (n==0){
            return;
        }
        
        int c=a+b;
        System.out.print(c+" ");
        fibnance(b,c,n-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=0,b=1;
        int n=sc.nextInt();
        System.out.print(a+" ");
        System.out.print(b+" ");
        fibnance(a,b,n-2);
    }
}
