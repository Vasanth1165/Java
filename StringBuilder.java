import java.util.*;
class java{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Battu");
        System.out.println(sb);
        // set Char at
        sb.setCharAt(0,'G');
        System.out.println(sb);
        // insert
        sb.insert(1,'i');
        System.out.println(sb);
        //delete 
        sb.delete(1,5);
        System.out.println(sb);
        
    }
}
