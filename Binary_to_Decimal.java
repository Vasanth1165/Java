import java.util.*;
class java{
    public static int toDecimal(int x){
        int i=0;
        double sum=0;
        while (x>0){
            if(x%10==1){
                sum=sum+(Math.pow(2,i));
                x=x/10;
                i++;
            }else{
                x=x/10;
                i++;
            }
        }
        return (int)sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            System.out.println(toDecimal(x));
        }
    }
}
