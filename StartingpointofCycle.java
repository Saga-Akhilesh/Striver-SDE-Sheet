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
public class StartingpointofCycle{
    static Node Startingpoint(Node head){
        if(head==null||head.next==null){
            return null;
        }
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){    //if loop is there
                fast=head;
                while(slow!=fast){   //to know the starting point of loop, place the fast pointer again on head and move both pointers simultaneouly by one step. A one point they will meet again. That point the starting point of loop.So return slow.
                slow=slow.next;
                fast=fast.next;
                }
                return slow;
            }
        }
         return null;
    }
}