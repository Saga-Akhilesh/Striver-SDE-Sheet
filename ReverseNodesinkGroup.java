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
public class ReverseNodesinkGroup{
    public static void main(String args[]){
        Node head =new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        Node result=Reversekthgroup(head,2);
        printlist(result);
    }
    static Node Reversekthgroup(Node head,int k){
        if(head==null||k==1) return head;
        Node dummy = new Node(0);
        dummy.next=head;
        Node curr=dummy,prev=dummy,nex=dummy;
        int length=0;

        while(curr.next!=null){   //compute the length of linked list
            curr=curr.next;
            length++;
        }
        
        while(length>=k){
            curr=prev.next;
            nex=curr.next;
            for(int i=1;i<k;i++){
                curr.next=nex.next;
                nex.next=prev.next;
                prev.next=nex;
                nex=curr.next;
            }
            prev=curr;
            length-=k;
        }
        return dummy.next;
    }


    static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"  ");
            curr=curr.next;
        }
    }
}