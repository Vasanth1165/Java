import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
class java{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> set=new HashSet<>();
        // add 
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        
        // printing a set
        System.out.println(set);
        
        // Size 
        System.out.println(set.size());
    
        //  Iterator
         
        Iterator it =set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        
        
        // contains
        if(set.contains(1)){
            System.out.println("present");
        }
        
        
        // remove
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("absent");
        }
        
      
        //  is Empty or not
        if(set.isEmpty()){
            System.out.println("set is Empty");
        }
        else{
            System.out.println("set is not Empty");
        }
    }
}
