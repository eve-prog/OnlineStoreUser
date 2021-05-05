package ro.ctrln.java;

public class WishListUsage {
    public static void main(String[] args) {
        OrdersList<String> wishList =  new OrdersList<>();
        wishList.addElement("mixer");
        wishList.addElement("toaster");
        wishList.addElement("laptop");
        wishList.addElement("phone case");
        System.out.println("The element on the position 0 is: " + wishList.getElement(0));
        System.out.println("The element on the position 1 is: " + wishList.getElement(1));
        System.out.println("The element on the position 2 is: " + wishList.getElement(2));
        System.out.println("The element on the position 3 is: " + wishList.getElement(3));

        System.out.println("The size of wishList after adding elements is: " + wishList.getSize());

        wishList.removeElement(2);

        System.out.println("The element on the position 0 is: " + wishList.getElement(0));
        System.out.println("The element on the position 1 is: " + wishList.getElement(1));
        System.out.println("The element on the position 2 is: " + wishList.getElement(2));
        System.out.println("The size of wishList after removing the element on the position 2 is: " + wishList.getSize());

        wishList.removeElement(0);
        System.out.println("The size of wishList after removing elements is: " + wishList.getSize());

        for (int index = 0; index < wishList.getSize(); index++) {
            System.out.println("The element on the position " + index + " is: " + wishList.getElement(index));
        }
    }
}


