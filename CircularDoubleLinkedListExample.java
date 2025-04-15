class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class CircularLinkedList {
    private Node head;
    private Node tail;

    public CircularLinkedList() {
        head = null;
        tail = null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            tail = head;
        } else {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd(int data) { 
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            tail = head;
        } else {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void delete(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            if (head == tail) { 
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = tail;
                tail.next = head;
            }
            return;
        }

        Node current = head;
        while (current != tail && current.data != data) {
            current = current.next;
        }

        if (current == tail && current.data == data) { 
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        } else if (current != tail) {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    public void displayForward() {
        Node current = head;
        if (current == null) {
            System.out.println("Circular doubly linked list is empty");
            return;
        }
        System.out.println("Circular doubly linked list (forward):");
        do {
            System.out.println(current.data);
            current = current.next;
        } while (current != head);
        System.out.println("(Head)");
    }

    public void displayBackward() {
        Node current = tail;
        if (current == null) {
            System.out.println("Circular doubly linked list is empty");
            return;
        }
        System.out.println("Circular doubly linked list (backward):");
        do {
            System.out.println(current.data);
            current = current.prev;
        } while (current != tail); 
        System.out.println("(Tail)");
    }
}

public class CircularDoubleLinkedListExample {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtBeginning(0);
        list.insertAtEnd(3);

        list.displayForward();
        list.displayBackward();

        list.delete(2);
        System.out.println("Circular doubly linked list after deleting:");
        list.displayForward();
    }
}