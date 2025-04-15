import java.util.ArrayList;

public class DynamicList {
    private ArrayList<Integer> list;

    public DynamicList() {
        list = new ArrayList<>();
    }

    public void add(int element) {
        list.add(element);
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("Error. The list is empty.");
            return;
        }
        if (index < 0 || index >= list.size()) {
            System.out.println("Invalid index. The element can't be removed");
        } else {
            list.remove(index);
        }
    }

    public int get(int index) {
        if (isEmpty()) {
            System.out.println("Error. The list is empty.");
            return -1;
        }
        if (index < 0 || index >= list.size()) {
            System.out.println("Invalid index.");
            return -1;
        }
        return list.get(index);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("The list is empty");
        } else {
            System.out.println("List Elements: " + list);
        }
    }

    public static void main(String[] args) {
        DynamicList list = new DynamicList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.display();

        list.add(60);
        list.display();

        list.remove(2);
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("Element at index 10: " + list.get(10));
    }
}