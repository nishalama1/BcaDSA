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

class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
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
                head.prev = null;
            }
            return;
        }

        if (tail.data == data) {
            tail = tail.prev;
            tail.next = null;
            return;
        }

        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current != null) {
            if (current.prev != null) {
                current.prev.next = current.next;
            }
            if (current.next != null) {
                current.next.prev = current.prev;
            }
        }
    }

    public void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("null");
    }

    public void displayBackward() {
        Node current = tail;
        while (current != null) {
            System.out.println(current.data);
            current = current.prev;
        }
        System.out.println("null");
    }
}

public class DoublyLinkedListExample {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtBeginning(0);
        list.insertAtEnd(3);

        System.out.println("Doubly linked list (forward):");
        list.displayForward();

        System.out.println("Doubly linked list (backward):");
        list.displayBackward();

        list.delete(2);
        System.out.println("Doubly linked list after deleting 2 (forward):");
        list.displayForward();

        list.delete(0);
        System.out.println("Doubly linked list after deleting 0 (forward):");
        list.displayForward();
    }
}