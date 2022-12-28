package java_practice.datastructure;

public class LinkedListDemo<T> {
    Node<T> head;
    Node<T> tail;
    int size;
    static final String EMPTY_LIST = "List is Empty";

    public LinkedListDemo() {
        this.size = 0;
    }

    class Node<T> {
        T data;
        Node<T> next;  //reference to next node

        //constructors
        Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
            size++;
        }

        Node(T data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add -first,last,anyPosition
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        if (tail == null) {       //list is empty
            tail = head;
        }
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (tail == null) {
            addFirst(data);
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void insert(T data, int index) {
        if (index == 0) {          //first,list empty
            addFirst(data);
            return;
        }
        if (index == size) {          //last index
            addLast(data);
            return;
        }
        Node<T> temp = head;         //assigning head to temp
        for (int i = 1; i < index; i++) {
            temp = temp.next;                 //to get to the index position
        }
        Node<T> newNode = new Node<>(data, temp.next);
        temp.next = newNode;
    }

    //display
    public void printList() {
        if (head == null) {
            System.out.println(EMPTY_LIST);
        }
        Node<T> temp = head;

        while (temp != null) {                            //traversing
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");

    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println(EMPTY_LIST);
            return;
        }
        size--;
        head = head.next;    //moving head to next node
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println(EMPTY_LIST);
            return;
        }
        size--;
        if (head.next == null) {     //if only one element
            head = null;    // pointing head as null
        } else {
            Node<T> secondLastNode = head;
            Node<T> lastNode = head.next;
            while (lastNode.next != null) {
                lastNode = lastNode.next;    //at last node
                secondLastNode = secondLastNode.next;
            }
            secondLastNode.next = null;
        }
    }

    public void delete(int index) {
        if (head == null) {
            System.out.println(EMPTY_LIST);
        } else {
            Node<T> temp1 = head;
            Node<T> temp2 = head.next;
            for (int i = 1; i < index; i++) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            temp1.next = temp2.next;
            size--;
        }
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LinkedListDemo<Integer> list = new LinkedListDemo<>();
        list.addFirst(0);
        list.addLast(1);
        list.insert(2, 2);
        list.insert(3, 3);
        list.addLast(4);
        list.printList();
        list.delete(3);
        list.printList();
        System.out.println(list.getSize());
        list.deleteFirst();
        list.deleteLast();
    }
}