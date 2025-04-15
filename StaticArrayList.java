
    class StaticArrayList {
        private int[] arr;
        private int size;
        private int capacity;
    
        // Constructor to initialize the array with a fixed size
        public StaticArrayList(int capacity) {
            this.capacity = capacity;
            this.arr = new int[capacity];
            this.size = 0;
        }
    
        // Insert an element at the end
        public void insert(int value) {
            if (size == capacity) {
                System.out.println("List is full. Cannot insert " + value);
                return;
            }
            arr[size++] = value;
        }
    
        // Delete an element by index
        public void delete(int index) {
            if (index < 0 || index >= size) {
                System.out.println("Invalid index");
                return;
            }
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1]; // Shift elements left
            }
            size--;
        }
    
        // Search for an element
        public int search(int value) {
            for (int i = 0; i < size; i++) {
                if (arr[i] == value) {
                    return i; // Return index if found
                }
            }
            return -1; // Not found
        }
    
        // Display the list
        public void display() {
            if (size == 0) {
                System.out.println("List is empty.");
                return;
            }
            System.out.print("List elements: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            StaticArrayList list = new StaticArrayList(5);
    
            list.insert(10);
            list.insert(20);
            list.insert(30);
            list.insert(40);
            list.insert(50);
    
            list.display();
    
            list.delete(2); // Removes 30
            list.display();
    
            int index = list.search(40);
            System.out.println("Element 40 found at index: " + index);
        }
    }

