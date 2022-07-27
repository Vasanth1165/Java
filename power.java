import java.util.*;
class recursion{
    public static int power(int x,int n){
        if (n==0){
            return 1;
        }if(x==0){
            return 0;
        }
        
        int xpown1=power(x,n-1);
        int xpown=x*xpown1;
        return xpown;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int ans=power(x,n);
        System.out.println(ans);
        
    }
}
