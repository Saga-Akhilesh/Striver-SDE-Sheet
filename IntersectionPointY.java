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
public class IntersectionPointY{
    static Node intersectionPoint(Node headA,Node headB){
        if(headA==null||headB==null){
            return null;
        }
        //Take two dummy nodes a and b . Place them on head of both LinkedList respectively
        Node a=headA;   
        Node b=headB;
        //move until a equal to b
        while(a!=b){
            a=a==null?headB:a.next;      //after traversing, if a reaches null then we just reset the pointer a to head of another linkedlist
            b=b==null?headA:b.next;       //if not reached then continue in the same linkedlist
        }
        return a;     //return a because after traversing we get intersection point , if both pointers collides or we get null if we didnt find intersection.
    }
}