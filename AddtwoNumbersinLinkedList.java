class Node{
    int data;
    Node next;
    Node(){}
    Node(int x){
        data=x;
        next=null;
    }
}
public class AddtwoNumbersinLinkedList{
    static Node add(Node l1,Node l2){
        Node dummy = new Node();
        Node temp=dummy;
        int carry=0;
        while(l1!=null || l2!=null || carry==1){
            int sum=0;
            if(l1!=null){
                sum+=l1.data;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.data;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            Node node = new Node(sum%10);
            temp.next=node;
            temp=temp.next;
        }
        return dummy.next;
    }
    public static void main(String args[]){
        Node head1 =new Node(2);
        head1.next=new Node(4);
        head1.next.next=new Node(3);
        Node head2=new Node(5);
        head2.next=new Node(6);
        head2.next.next=new Node(4);
        Node result=add(head1,head2);
        printlist(result);
    }
    static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}