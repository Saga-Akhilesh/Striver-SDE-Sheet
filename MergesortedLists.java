class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class MergesortedLists{
    static Node merge(Node l1,Node l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        //everytime l1 value should be less than l2 
        //suppose if the starting l1 value itself is bigger than l2 value then swap
        if(l1.data>l2.data){
            Node temp=l1;
            l1=l2;
            l2=temp;
        }
        Node result=l1;   //point result node to l1 which is head so we can return result since it is pointing to head
        while(l1!=null && l2!=null){
            Node temp=null;
            while(l1!=null && l1.data<=l2.data){
                temp=l1;
                l1=l1.next;
            }
            //if l1 is greater than l2 then break the connection. then temp.next will be l2 so connection will be made to smaller value and swap l1 and l2
            temp.next=l2;
            //swap
            temp=l1;
            l1=l2;
            l2=temp; 
        }
        return result;
    }
    public static void main(String args[]){
        Node head1 =new Node(10);
        head1.next=new Node(20);
        head1.next.next=new Node(40);
        Node head2=new Node(10);
        head2.next=new Node(30);
        head2.next.next=new Node(40);
        head1=merge(head1,head2);
        printlist(head1);
    }
    static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
    }
}