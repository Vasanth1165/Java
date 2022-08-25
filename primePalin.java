import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		ArrayList<Integer> temp=new ArrayList<>();
		for(int i=10;i<=10000;i++){
		    int c=0;
		    for (int j=2;j<=(int)Math.sqrt(i);j++){
		        if(i%j==0){
		            c++;
		            break;
		        }
		    }
		    if(c==0){
		        list.add(i);
		    }
		}
		for(int i=0;i<list.size();i++){
		    if(list.get(i) !=0){
		        int xx=list.get(i);
		        int yy=xx;
		        int sum=0;
		        while(xx>0){
		            int r=xx%10;
		            sum=sum*10+r;
		            xx=xx/10;
		        }
		        if(sum==yy){
		            temp.add(yy);
		        }
		    }
		}
		for(int i=0;i<temp.size();i++){
		    if(temp.get(i)>n){
		        System.out.println(temp.get(i));
		        break;
		    }
		}
		System.out.println(temp);
	}
}
