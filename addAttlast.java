import java.util.*;
import java.lang.*;

class GFG {
    
    public static void addAtlast(String str,int idx,int count,String newstr){
        if (idx==str.length()){
            for(int i=0;i<count;i++){
                newstr+='x';
            }
            System.out.println(newstr);
            return;
        }
        char currchar=str.charAt(idx);
        if (currchar=='x'){
            addAtlast(str,idx+1,count+1,newstr);
        }else{
            newstr+=currchar;
            addAtlast(str,idx+1,count,newstr);
        }
    }
    
	public static void main (String[] args) {
	    String str="axbxccxxm";
	    addAtlast(str,0,0,"");
	    
	}
}
