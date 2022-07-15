import java.util.*;
 
public class Arrays {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int m = sc.nextInt();
      int n = sc.nextInt();
 
      int matrix[][] = new int[m][n];
      for(int i=0; i<m; i++) {
           for(int j=0; j<n; j++) {
               matrix[i][j] = sc.nextInt();
           }
      }
 
      System.out.println("The Spiral Order Matrix is : ");
      int rs = 0;
      int re= m-1;
      int cs = 0;
      int ce = n-1;
      
      while(rs<=re && cs<=ce){
          for(int col=cs;col<=ce;col++){
              System.out.print(matrix[rs][col]+" ");
          }
          rs++;
          for(int row=rs;row<=re;row++){
              System.out.print(matrix[row][ce]+" ");
          }
          ce--;
          for(int col=ce;col>=cs;col--){
              System.out.print(matrix[re][col]+" ");
          }
          re--;
          for(int row=re;row>=rs;row--){
              System.out.print(matrix[row][cs]+" ");
          }
          cs++;
          System.out.print("");
      }
   }
}
