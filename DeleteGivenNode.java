class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class DeleteGivenNode{
    static void delete(Node node){
        node.data=node.next.data;   //copy the value of next node into given node address (here next node value means value of next node of given node 
        node.next=node.next.next;  //cutting the connection and making the of new node to the next node of copied node.
    }
}