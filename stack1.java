public class stack1{
    int maxSize;
    int[] stack_Array;
    int top;

    public stack1(int size) {
        this.maxSize = size;
        this.stack_Array = new int[maxSize];
        this.top = -1;
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack overflow");
            return;
        }
        stack_Array[++top] = value;
        System.out.println(value + " pushed into the stack");
    }

    // Method to pop an element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        int poppedElement = stack_Array[top--];
        System.out.println(poppedElement + " popped from the stack");
        return poppedElement;
    }

    // Method to peek the top element of the stack
    public int top() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack_Array[top];
    }


    public static void main(String[] args) {
        stack1 stack = new stack1(5); // Creating a stack of size 5(object creation)

        // Pushing elements onto the stack
        stack.push(50);
        stack.push(40);

        // Peeking the top element
        System.out.println("Top element of the stack: " + stack.top());
        // Popping elements from the stack
        stack.pop();
        stack.pop();
        stack.pop(); // Trying to pop from an empty stack
    
    }
}