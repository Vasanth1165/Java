import java.util.*;
class sai{
    public static int greater(int m,int n){
        if (m>n){
            return m;
        }else{
            return n;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(greater(m,n));
        
    }
}
