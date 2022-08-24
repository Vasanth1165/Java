import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String temp="";
		for(int i=0;i<str.length();i++ ){
			int c=0;
			for(int j=0;j<str.length();j++){
				if (str.charAt(i)==str.charAt(j)){
					c++;
				}
			}
			if(c==1){
				temp +=str.charAt(i);
			}
		}
		System.out.println(temp);
		System.out.println("first ele : "+temp.charAt(0));
		System.out.println("last ele : "+temp.charAt(temp.length()-1));
	}
}
