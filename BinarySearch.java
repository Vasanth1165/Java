// time complexcity-- O(logn)
import java.util.*;
class binarySearch {
	public static void main (String[] args) {
    	int key=9;
    	int arr[]={2,5,7,9,18,20,72,92};
    	int s=0;
    	int e=arr.length-1;
    	int mid=(s+e)>>1;
    	while(s<=e){
    	    if(arr[mid]==key){
    	        System.out.println(mid);
    	        break;
    	    }else if(arr[mid]>key){
    	        e=mid-1;
    	    }else{
    	        s=mid+1;
    	    }
    	    mid=(s+e)>>1;
    	}
    	if(s>e){
    	    System.out.println("not found");
    	}
	}
}
