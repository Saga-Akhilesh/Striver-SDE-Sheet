class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class ReverseList{
    public static void main(String args[]){
        Node head =new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head=reverse(head);
        printlist(head);
    }
    static Node reverse(Node head){
        Node dummy = null;   //creating a dummy node
        while(head!=null){   //until head reaches null
            Node next = head.next;   // creating next node that points to immidiate next node of head
            head.next=dummy;         // now node between head and node inside next will be broken and head.next will point
            dummy =head;            // now place dummy on head node
            head=next;              // now place head on next node
        }
        return dummy;
    }
    static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
    }
}