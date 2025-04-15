//linear queue in dynamic way 
import java.util.ArrayList;
import java.util.List;
public class implementationOfQueue {
     List<Integer>queue=new ArrayList<>();

     public void enqueue(int num){
        queue.add(num);
     }
     
       
     public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        queue.removeFirst();
    }


    public boolean isEmpty(){
        return queue.isEmpty();
     }
    
     
     public int size(){
        return queue.size();
     }
    
     public static void main(String[] args) {

        implementationOfQueue q= new implementationOfQueue();
        System.out.println("queue size before enqueue:"+q.size());
        // q.enqueue(0);
        // q.enqueue(1);
        for(int i=1;i<=20;i++){
            q.enqueue(i); 
        }
        q.dequeue();
        System.out.println("Is queue empty?  "+q.isEmpty());
        System.out.println("queue size after enqueue:"+q.size());
    
     }
}
