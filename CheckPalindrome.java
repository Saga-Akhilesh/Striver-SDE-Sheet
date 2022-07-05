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
public class CheckPalindrome{
    public static void main(String args[]){
        Node head =new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(2);
        head.next.next.next.next=new Node(1);
        System.out.println(isPalindrome(head));
    }
   static boolean isPalindrome(Node head){
    if(head==null || head.next==null){
        return true;
    }
    //find the middle node of LinkedList
    Node slow=head;
    Node fast=head;
    while(fast.next!=null && fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    //reverse right half
    slow.next = reverse(slow.next);
    //move slow pointer one step ahead
    slow=slow.next;
    Node dummy=head;
    while(slow!=null){
        if(dummy.data!=slow.data){
            return false;
        }
        dummy=dummy.next;
        slow=slow.next;
    }
    return true;
   }
   static Node reverse(Node head){
    Node pre=null;
    Node next=null;
    while(head!=null){
        next=head.next;
        head.next=pre;
        pre=head;
        head=next;
    }
    return pre;
   }
}