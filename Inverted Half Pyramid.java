import java.io.*;
import java.lang.*;

class GFG {
    
    public static void main(String args[])
    {
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print((n-i+1)+" ");
            }
            System.out.println();
        }
	}
}
