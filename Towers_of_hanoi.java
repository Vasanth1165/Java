import java.util.*;
class java{
    public static void main(String args[]){
        int n=3;
        isHenai(n,"S","H","D");
    }
    public static void isHenai(int n,String src,String hlp,String des){
        
        if(n==1){
            System.out.println("transvered "+n+"from"+src+" to "+des);
            return;
        }
        isHenai(n-1,src,des,hlp);
        System.out.println("transvered "+n+"from"+src+ " to "+des);
        isHenai(n-1,hlp,src,des);
    }
}
