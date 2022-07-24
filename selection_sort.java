import java.util.*;

class java {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    for(int i=0;i<arr.length-1;i++){
	        int small=i;
	        for(int j=i+1;j<arr.length;j++){
	            if (arr[small]>arr[j]){
	                small=j;
	            }
	        }
	        int temp=arr[small];
	        arr[small]=arr[i];
	        arr[i]=temp;
	    }
	    for (int i:arr){
	        System.out.print(i+" ");
	    }
	}
}
