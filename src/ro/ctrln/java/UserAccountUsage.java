package ro.ctrln.java;

import java.util.ArrayList;

public class UserAccountUsage {

    public static void main(String[] args) {

        ArrayList<Orders> orders = new ArrayList();

        ArrayList<String> productsOrder1 = new ArrayList<>();
        productsOrder1.add("tv");
        productsOrder1.add("vacuum cleaner");

        ArrayList<String> productsOrder2 = new ArrayList<>();
        productsOrder2.add("telephone");

        orders.add(new Orders(1, "Order 1", productsOrder1));
        orders.add(new Orders(2, "Order 2", productsOrder2));

//        orders.put(4, "electric toothbrush");

        System.out.println("The orders are: " + orders);

        ArrayList<Wishlist> wishlist = new ArrayList<>();

        wishlist.add(new Wishlist(1, "mixer"));
        wishlist.add(new Wishlist(2, "laptop"));
        wishlist.add(new Wishlist(3, "phone case"));

        System.out.println("The Wishlist is: " + wishlist);

        ArrayList<UserAccount> userAccount = new ArrayList<>();
        userAccount.add(new UserAccount("Alina", "alina@gmail.com", "56789046", "Str. Garoafelor, nr 5"));
        System.out.println("UserAcount-ul cu datele sale personale: " + userAccount);

//        userAccount.add(new UserAccount("Alina", "alina@gmail.com", "56789046", "Str. Garoafelor, nr 5", orders.get(1), wishlist.get(1)));
//        System.out.println("UserAccount-ul cu datele sale + 1 comanda + 1 produs din wishlist: " + userAccount);

        System.out.println("The number of orders is: " + orders.size());
        System.out.println("The size of Order1 is: " + productsOrder1.size());
        System.out.println("The product on the position 1 from Order1 is: " + productsOrder1.get(0));
        System.out.println("The product on the position 2 from Order1 is: " + productsOrder1.get(1));

        for (int index = 0; index < orders.size(); index++) {
            System.out.println("The order from position " + index + " is: " + orders.get(index));
        }

        System.out.println("The returned product from Order1 is: " + productsOrder1.get(0));
        productsOrder1.remove("tv");
        System.out.println("The size of Order1 after returning a product: " + productsOrder1.size());
        System.out.println("The products remained from Order1 after returning a product is: " + productsOrder1);


        System.out.println("The product on the position 0 is: " + wishlist.get(0));
        System.out.println("The product on the position 1 is: " + wishlist.get(1));
        System.out.println("The product on the position 2 is: " + wishlist.get(2));

        System.out.println("The size of wishlist is: " + wishlist.size());

        wishlist.remove(2);

        System.out.println("The element on the position 0 is: " + wishlist.get(0));
        System.out.println("The element on the position 1 is: " + wishlist.get(1));
        System.out.println("The size of wishlist after removing the element on the position 2 is: " + wishlist.size());

        for (int index = 0; index < wishlist.size(); index++) {
            System.out.println("The product from the wishlist on the position " + index + " is: " + wishlist.get(index));
        }
    }
}
