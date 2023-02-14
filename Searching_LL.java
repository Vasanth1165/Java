// #alpha
public class LL{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void main(String args[]){
        LL list=new LL();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(8);
        list.addFirst(3);
        list.addFirst(7);
        list.addFirst(5);
        list.addFirst(1);
        list.printList();
        System.out.println(list.searchList(3));
    }
    //add First
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    // printing
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
        System.out.println("null");
    }
    // Searching in list
    public int searchList(int x){
        int idx=0;
        if(head==null){
            return -1;
        }
        Node curr=head;
        while(curr!=null){
            if(curr.data==x){
                idx++;
                return idx;
            }
            curr=curr.next;
            idx++;
        }
        return idx;
    }
}
