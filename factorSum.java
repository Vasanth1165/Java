import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class java{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        while(sc.hasNext()){
            int x=sc.nextInt();
            list.add(x);
        }
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            int t=list.get(i);
            int sum=0;
            for(int j=1;j<=t;j++){
                if(t%j==0){
                    sum+=j;
                }
            }
            for(int j=0;j<list.size();j++){
                if(sum==list.get(j)){
                    temp.add(list.get(j));
                }
            }
            
        }
        Collections.sort(temp);
        if(temp.size()==0){
            System.out.println(-1);
        }else{
            for(int i=0;i<temp.size();i++){
                System.out.print(temp.get(i)+" ");
            }
        }
    }
}
