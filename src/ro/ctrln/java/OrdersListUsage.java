package ro.ctrln.java;

public class OrdersListUsage {
    public static void main(String[] args) {
        OrdersList<String> orders =  new OrdersList<>();
        orders.addElement("TV");
        orders.addElement("vacuum cleaner");
        orders.addElement("telephone");
        orders.addElement("electric toothbrush");
        System.out.println("The element on the position 0 is: " + orders.getElement(0));
        System.out.println("The element on the position 1 is: " + orders.getElement(1));
        System.out.println("The element on the position 2 is: " + orders.getElement(2));
        System.out.println("The element on the position 3 is: " + orders.getElement(3));

        System.out.println("The size of orders after adding elements is: " + orders.getSize());

        orders.removeElement(2);

        System.out.println("The element on the position 0 is: " + orders.getElement(0));
        System.out.println("The element on the position 1 is: " + orders.getElement(1));
        System.out.println("The element on the position 2 is: " + orders.getElement(2));
        System.out.println("The size of orders after removing the element on the position 2 is: " + orders.getSize());

        orders.removeElement(0);
        System.out.println("The size of orders after returned elements is: " + orders.getSize());

        for (int index = 0; index < orders.getSize(); index++) {
            System.out.println("The element on the position " + index + " is: " + orders.getElement(index));
        }
    }
}

