import java.util.*;
public class ImplementQueueUsingStack{
    public static void main(String args[]){
        myQueue q = new myQueue();
        q.push(2);
        q.push(5);
        q.push(3);
        System.out.println("The top element is " + q.top());
        System.out.println("The element poped is " + q.pop());
        q.push(6);
        System.out.println("The element poped is " + q.pop());
        System.out.println("The element poped is " + q.pop());
        System.out.println("The top element is " + q.top());
        System.out.println("The size of the queue is " + q.size());

    }
}
class myQueue{
    Stack < Integer > input = new Stack < > ();
    Stack < Integer > output = new Stack < > ();

    void push(int x){
        System.out.println("The element pushed is " + x);
        input.push(x);
    }
    int pop(){
       if(output.empty()){
            while(!input.empty()){
            output.push(input.peek());
            input.pop();
            }
        }
            return output.pop();
    }    
    int top(){
        if(output.empty()){
            while(!input.empty()){
            output.push(input.peek());
            input.pop();
            }
        }
           return output.peek();
    }
    int size() {
        return (output.size() + input.size());
    }
}