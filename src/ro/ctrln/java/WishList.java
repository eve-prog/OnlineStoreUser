package ro.ctrln.java;

import java.util.Arrays;

public class WishList <T> {

    private static final int WISHLIST_SIZE = 10;
    private Object[] wishList = new Object[WISHLIST_SIZE];
    private int size = 0;

    public void addElement(T element) {
        if (size == wishList.length) {
            increaseSize();
        }
        wishList[size] = element;
        size++;
    }

    private void increaseSize() {
        wishList = Arrays.copyOf(wishList, wishList.length * 2);
    }

    public int getSize() {
        return size;
    }

    @SuppressWarnings("unchecked")
    public T getElement(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("The index is out of range 0 - size-1");
        }
        return (T) wishList[index];
    }

    public void removeElement(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("IThe index is out of range 0 - size-1");
        }
        System.arraycopy(wishList, index + 1, wishList, index, size - index);
        size--;
    }
}
