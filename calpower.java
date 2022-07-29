import java.util.*;
class recursion{
    public static int calpower(int x, int n){
        if (n==0){
            return 1;
        }
        if(n%2==0){
            return calpower(x, n/2) * calpower(x, n/2);
        }else{
            return calpower(x, n/2) * calpower(x, n/2) * x;
        }
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int ans=calpower(x, n);
        System.out.println(ans);
    }
}
