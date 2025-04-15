package Stack_Class;

public class StackClass {
    static class Node{
      int data;
      Node next;
      public Node(int data){
        this.data=data;
        next=null; //initialization gareko
      }

    }

    static class Stack{
        public static Node head; //also static cause single head ho--- head chai linked list ko head and stack ko top
        public static boolean isEmpty(){
         return head==null;

        }
        public static void push(int data) {
          Node newNode=new Node(data) ;
          if(isEmpty()){
            head=newNode;
            return;
          }
          newNode.next=head;
          head=newNode;
  
        }

        public static int pop(){
          if(isEmpty()){
            return -1;//-1 represnts stack is empty
          }
          int top= head.data;
          head = head.next;
          return top;
        }

        public static int peek(){
          if(isEmpty()){
            return -1;
          }
          return head.data;
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
          System.out.println(s.peek());
          s.pop();
        }
    }
}
