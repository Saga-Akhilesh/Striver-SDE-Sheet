class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class MiddleElement{
    public static void main(String args[]){
        Node head =new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        head=Middle(head);
        printlist(head);
    }
    static Node Middle(Node head){
        //Using tortoise approach
        Node slow= head, fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
    }
}