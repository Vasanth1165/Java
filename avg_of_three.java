import java.util.*;
class sai{
    public static float average(float a,float b,float c){
        float avg=(a+b+c)/3;
        return avg;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        float a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println(average(a,b,c));
    }
}
