import java.util.*;

class recurion {
    public static void printsum(int i,int n,int sum){
        if (i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        printsum(i+1,n,sum+i);
    }
	public static void main (String[] args) {
    printsum(1,10,0);

	}
}
