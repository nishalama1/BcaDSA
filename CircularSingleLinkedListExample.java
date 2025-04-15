class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;

    }
}
class CircularLinkedList{
    private Node head;
    private Node tail;

    public CircularLinkedList(){
        head = null;
        tail = null;
    }
    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            head.next = head;
            tail = head;
        }else{
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            head.next = head;
            tail = head;
        }else{
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
    }
    public void delete(int data){
        if(head == null){
            return;

        }
        if(head.data == data){
            if(head == tail){
                head = null;
                tail = null;

            }else{
                head = head.next;
                tail.next = head;
            }
            return;
        }
        Node current = head;
        Node prev = null;
        while (current != tail && current.data != data) {
            prev = current;
            current = current.next;
        }
        if(current != tail){
            prev.next = current.next;
        }
    }
    public void display(){
        Node current = head;
        if(current == null){
            System.out.println("Circular single linked list is empty");
            return;
        }
        System.out.println("circular single linked list ");
        do{
            System.out.println(current.data);
            current = current.next;

        }while(current != head);
        System.out.println(head.data + "(Head)");
    }
}

public class CircularSingleLinkedListExample {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtBeginning(0);
        list.insertAtEnd(3);

        list.display();

        list.delete(2);

        System.out.println("circular single linked list after deleting:");
        list.display();
    }

}