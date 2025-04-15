class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void insert(int data) {
        Node NewNode = new Node(data);
        if (head == null) {
            head = NewNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = NewNode;
        }
    }

    public void delete(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        Node prev = null;
        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }
        if (current != null && prev != null) {
            prev.next = current.next;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next; 
        }
        System.out.println("Null");
    }
}

class LinkedListExample {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(100);
        list.insert(1000);
        list.insert(10000);
        list.insert(100000);
        list.insert(1000000);

        System.out.println("Initial linked list:");
        list.display();

        list.delete(1000);
        System.out.println("After deleting 1000:");
        list.display();
    }
}