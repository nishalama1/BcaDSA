package Stack_Class;

public class StackArrayList {
class Stack{
    ArrayList<Integer> List = new ArrayList<>();
    public static boolean isEmpty(){
       return List.size()==0;
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
    

