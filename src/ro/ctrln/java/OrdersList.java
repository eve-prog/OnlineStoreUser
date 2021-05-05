package ro.ctrln.java;

import java.util.Arrays;

public class OrdersList<T> {
    private static final int INITIAL_SIZE = 10;
    private Object[] list = new Object[INITIAL_SIZE];
    private int size = 0;

    public void addElement(T element) {
        if (size == list.length) {
            increaseSize();
        }
        list[size] = element;
        size++;
    }

    private void increaseSize() {
        list = Arrays.copyOf(list, list.length * 2);
    }

    public int getSize() {
        return size;
    }

    @SuppressWarnings("unchecked")
    public T getElement(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("The index is out of range 0 - size-1");
        }
        return (T) list[index];
    }

    public void removeElement(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("The index is out of range 0 - size-1");
        }
        System.arraycopy(list, index + 1, list, index, size - index);
        size--;
    }
}
