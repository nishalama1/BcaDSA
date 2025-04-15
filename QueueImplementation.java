
    public class QueueImplementation {
        private int[] arr;
        private int front, rear, size, maxsize;
    
        public QueueImplementation(int maxSize) {
            this.maxsize=maxSize;
            arr=new int[maxSize];
            front = 0;
            rear = -1;
            size = 0;
        }
    
        // Check if the queue is full
        public boolean isFull() {
            return size == maxsize;
        }
    
        // Check if the queue is empty
        public boolean isEmpty() {
            return size == 0;
        }
    
        // Add an element to the queue
        public void enqueue(int item) {
            if (isFull()) {
                System.out.println("Queue is full. Cannot enqueue " + item);
                return;
            }
            rear = (rear + 1) % maxsize; // Circular increment
            arr[rear] = item;
            size++;
            System.out.println("Enqueued: " + item);
        }
    
        // Remove an element from the queue
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot dequeue.");
                return -1;
            }
            int item = arr[front];
            front = (front + 1) % maxsize; // Circular increment
            size--;
            return item;
        }
    
        // Get the front element
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }
            return arr[front];
        }
    
        // Print queue elements
        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return;
            }
            System.out.print("Queue: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[(front + i) % maxsize] + " ");
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            QueueImplementation queue = new QueueImplementation(5);
    
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            queue.enqueue(40);
            queue.enqueue(50);
            queue.enqueue(60); // Should indicate queue is full
    
            queue.display();
    
            System.out.println("Dequeued: " + queue.dequeue());
            System.out.println("Front element: " + queue.peek());
    
            queue.display();
    
            queue.enqueue(60); // Should work due to circular array
            queue.display();
        }
    }

