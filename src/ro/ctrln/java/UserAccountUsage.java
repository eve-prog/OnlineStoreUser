package ro.ctrln.java;

import java.util.ArrayList;

public class UserAccountUsage {

    public static void main(String[] args) {

        ArrayList<User> user = new ArrayList<>();
        user.add(new User("Alina", "alina@gmail.com", "123*"));

        ArrayList<Address> addresses = new ArrayList<>();
        addresses.add(new Address(1,"Iasi", "Str. Garoafelor", "nr 5"));
        addresses.add(new Address(2,"Iasi", "Str. Lalelelor", "nr 2"));

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "tv", 22.9));
        products.add(new Product(2, "phone", 10.2));
        //System.out.println("The products are: " + products);

        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order(1,("Order 1"), products));
        orders.add(new Order(2,("Order 2"), products));
       // System.out.println("The orders are: " + orders);

        ArrayList<Wishlist> wishlist = new ArrayList<>();
        wishlist.add(new Wishlist((1), products));
        //System.out.println("The wishlist is: " + wishlist);

        ArrayList<UserAccounts> userAccounts = new ArrayList<>();

        userAccounts.add(new UserAccounts(1, user, addresses, orders, wishlist));

        System.out.println("UserAcount-ul cu datele sale personale + adrese livrare + comenzi + wishlist: " + userAccounts);

//        userAccount.add(new UserAccount("Alina", "alina@gmail.com", "56789046", "Str. Garoafelor, nr 5", orders.get(1), wishlist.get(1)));
//        System.out.println("UserAccount-ul cu datele sale + 1 comanda + 1 produs din wishlist: " + userAccount);

          System.out.println("The number of orders is: " + orders.size());
//        System.out.println("The size of Order1 is: " + productsOrder1.size());
//        System.out.println("The product on the position 1 from Order1 is: " + productsOrder1.get(0));
//        System.out.println("The product on the position 2 from Order1 is: " + productsOrder1.get(1));

//
//        System.out.println("The returned product from Order1 is: " + productsOrder1.get(0));
//        productsOrder1.remove("tv");
//        System.out.println("The size of Order1 after returning a product: " + productsOrder1.size());
//        System.out.println("The products remained from Order1 after returning a product is: " + productsOrder1);
//
//        for (int index = 0; index < orders.size(); index++) {
//            System.out.println("The order from position " + index + " is: " + orders.get(index));
//        }
//
//        System.out.println("The product on the position 0 is: " + wishlist.get(0));
//        System.out.println("The product on the position 1 is: " + wishlist.get(1));
//        System.out.println("The product on the position 2 is: " + wishlist.get(2));
//
//        System.out.println("The size of wishlist is: " + wishlist.size());
//
//        wishlist.remove(2);
//
//        System.out.println("The element on the position 0 is: " + wishlist.get(0));
//        System.out.println("The element on the position 1 is: " + wishlist.get(1));
//        System.out.println("The size of wishlist after removing the element on the position 2 is: " + wishlist.size());
//
//        for (int index = 0; index < wishlist.size(); index++) {
//            System.out.println("The product from the wishlist on the position " + index + " is: " + wishlist.get(index));
//        }
    }
}
