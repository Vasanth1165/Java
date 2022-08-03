import java.util.*;
import java.lang.*;

class GFG {
    
    public static boolean map[]=new boolean[26];
    public static void rmDuplicates(String str,int idx,String newstr){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currChar=str.charAt(idx);
        if (map[currChar-'a']){
            rmDuplicates(str,idx+1,newstr);
        }else{
            newstr+=currChar;
            map[currChar-'a']=true;
            rmDuplicates(str,idx+1,newstr);
        }
    }
    
	public static void main (String[] args) {
	    String str="aaaaaa";
	    rmDuplicates(str,0,"");
	    
	}
}
