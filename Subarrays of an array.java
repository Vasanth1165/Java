import java.util.*;
class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int size=sc.nextInt();
		int c=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    for(int j=i;j<n;j++){
		      //  int sum=0;
		        for(int k=i;k<=j;k++){
		            System.out.print(arr[k]+" ");
		        }
		        System.out.println();
		    }
		}
	}
}
