class Node{
    int data;
    Node next;
    Node(){}
    Node(int data){
        this.data=data;
        this.next=null;
    }
    Node(Node next,int data){
        this.data=data;
        this.next=next;
    }
}
public class RemoveNthNode{
    public static void main(String args[]){
        Node head =new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        head.next.next.next.next.next=new Node(60);
        head=remove(head,2);
        printlist(head);
    }
    static Node remove(Node head,int n){
        Node dummy=new Node();
        dummy.next=head;
        Node fast=dummy;
        Node slow=dummy;

        for(int i=1;i<=n;++i){
            fast=fast.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }

    static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
    }
}