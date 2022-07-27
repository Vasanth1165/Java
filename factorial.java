import java.util.*;
class recursion{
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        
        int fact_n1=factorial(n-1);
        int fact=n*fact_n1;
        return fact;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=factorial(n);
        System.out.println(ans);
        
    }
}
