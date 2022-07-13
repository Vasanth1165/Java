import java.util.*;
class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner (System.in);
		String firstName=sc.nextLine();
		String midleName=sc.nextLine();
		String lastName=sc.nextLine();
		String FullName=firstName + midleName + lastName;
		System.out.println(FullName.length());
	}
}
