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
public class DetectaCycle{
    public static void main(String args[]){
        Node head =new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        head.next.next.next.next.next=head.next;
        System.out.println(hasCycle(head));
        //printlist(result);
    }
    static boolean hasCycle(Node head){
        if(head==null || head.next==null){
            return false;
        }
        Node fast=head;
        Node slow=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}