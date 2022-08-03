import java.util.*;
class GFG {
    public static void subseq(String str,int idx,String newstr){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currChar=str.charAt(idx);
        //to Be
        subseq(str,idx+1,newstr+currChar);
        // not to be
        subseq(str,idx+1,newstr);
    }
	public static void main (String[] args) {
	    String str="abdc";
	    subseq(str,0,"");
	    
	}
}
