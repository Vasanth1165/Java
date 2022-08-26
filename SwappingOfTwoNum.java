import java.util.*;
class swaping {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt(); //5
		int y=sc.nextInt(); //6
		x=x+y; //x=5+6 =11
		y=x-y; //y=11-6 =5
		x=x-y; //x=11-5 =6
		System.out.print(x+" "+y);
		
	}
}
