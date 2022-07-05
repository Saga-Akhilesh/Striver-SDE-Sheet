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
public class RotateList{
    public static void main(String args[]){
        Node head =new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        Node result=Rotate(head,2);
        printlist(result);
    }
    static Node Rotate(Node head,int k){
        if(head==null|| head.next==null || k==0){
            return head;
        }
        //compute length of linkedlist
        Node curr=head;
        int length=1;
        while(curr.next!=null){
            length++;
            curr=curr.next;
        }
        //since my current pointer at last index, so point the next of current pointer to head
        curr.next=head;
        k=k%length;   //if k is greater than length of linkedlist, make it smaller
        k=length-k;   // now move current pointer until it reaches length-kth node
        while(k-- >0){   //reducing k 
            curr=curr.next;
        }

        //after reaching length-kth node
        head=curr.next;
        curr.next=null; 
        return head;
    }

    static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"  ");
            curr=curr.next;
        }
    }
}