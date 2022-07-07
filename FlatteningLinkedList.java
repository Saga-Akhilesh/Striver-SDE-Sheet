class Node{
    int data;
    Node next;
    Node bottom;
    Node(int x){
        data=x;
        next=null;
        bottom=null;
    }
}
public class FlatteningLinkedList{
    static Node mergeTwolist(Node l1,Node l2){
        Node temp=new Node(0);
        Node res=temp;

        while(l1!=null && l2!=null){
            if(l1.data<l2.data){
                temp.bottom=a;
                temp=temp.bottom;
                a=a.bottom;
            }else{
                temp.bottom=b;
                temp=temp.bottom;
                b=b.bottom;
            }
            if(a!=null) temp.bottom=a;
            else temp.bottom=b;
        }
        return res.bottom;
    }
    static Node flatten(Node root){
        if(root==null||root.next==null){
            return root;
        }
        root.next=flatten(root.next);
        root=mergeTwolist(root);
        return root;
    }
}