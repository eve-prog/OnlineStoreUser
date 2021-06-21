package ro.ctrln.java;

import java.util.ArrayList;

public class Orders {

    public static void main(String[] args) {

        ArrayList<String> orders = new ArrayList<>();

        orders.add("TV");
        orders.add("vacuum cleaner");
        orders.add("telephone");
        orders.add("electric toothbrush");

        System.out.println("Comenzile sunt: " + orders);

        ArrayList<UserAccount> userAccount = new ArrayList<>();
        userAccount.add(new UserAccount("Alina", "alina@gmail.com", "56789046", "Str. Garoafelor, nr 5", orders));
        System.out.println("UserAccount-ul cu datele sale este: " + userAccount);

//
//        System.out.println("The element on the position 0 is: " + orders.get(0));
//        System.out.println("The element on the position 1 is: " + orders.get(1));
//        System.out.println("The element on the position 2 is: " + orders.get(2));
//        System.out.println("The element on the position 3 is: " + orders.get(3));
//
//        System.out.println("The size of orders after adding elements is: " + orders.size());
//
//        orders.remove(2);
//
//        System.out.println("The element on the position 0 is: " + orders.get(0));
//        System.out.println("The element on the position 1 is: " + orders.get(1));
//        System.out.println("The element on the position 2 is: " + orders.get(2));
//        System.out.println("The size of orders after removing the element on the position 2 is: " + orders.size());
//
//        orders.remove(0);
//        System.out.println("The size of orders after returned elements is: " + orders.stream());
//
//        for (int index = 0; index < orders.size(); index++) {
//            System.out.println("The element on the position " + index + " is: " + orders.get(index));
//        }
    }

}
