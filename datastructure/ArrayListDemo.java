package java_practice.datastructure;

import java.util.Arrays;
public class ArrayListDemo<T> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 5;
    Object elements[];
    public ArrayListDemo() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(T t) {
        if (size == elements.length) {
            increaseSize();
        }
        elements[size++] = t;
    }

    public void increaseSize() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public T get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) elements[index];
    }

    public Object removeAt(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Object removedElement = elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return removedElement;
    }

    public void remove(T t) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (t.equals(elements[i])) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            removeAt(index);
        }
    }

    public int getSize() {
        return size;
    }

    public void display() {
        System.out.print("Displaying list : ");
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayListDemo<Integer> list = new ArrayListDemo<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        list.display();
        list.removeAt(4);
        list.display();
        list.remove(7);
        list.display();
        System.out.println(list.get(5));
        System.out.println(list.getSize());

    }
}