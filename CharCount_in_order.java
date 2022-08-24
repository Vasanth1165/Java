import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String temp="";
		String num="";
		ArrayList<HashMap> list=new ArrayList<>();
		for(int i=0;i<str.length();i++ ){
			int c=0;
			for(int j=0;j<temp.length();j++){
				if (temp.charAt(j)==str.charAt(i)){
					c++;
				}
			}
			if(c==0){
				temp +=str.charAt(i);
			}
		}
		System.out.println(temp);
		for(int i=0;i<temp.length();i++){
			int cc=0;
			for(int j=0;j<str.length();j++){
				if (temp.charAt(i)==str.charAt(j)){
					cc++;
				}
			}
			num+=String.valueOf(cc);
		}
		System.out.println(num);
		for(int i=0;i<temp.length();i++){
		    HashMap<Character,Character> map=new HashMap<>();
		    map.put(temp.charAt(i),num.charAt(i));
		    list.add(map);
		    if(i==temp.length()-1){
		        System.out.print(temp.charAt(i)+":"+num.charAt(i));
		    }else{
		        System.out.print(temp.charAt(i)+":"+num.charAt(i)+", ");
		    }
		}
		System.out.println();
		System.out.println(list);
		
	}
}
