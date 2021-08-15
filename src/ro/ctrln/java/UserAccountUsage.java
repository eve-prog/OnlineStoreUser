package ro.ctrln.java;

import java.util.ArrayList;

public class UserAccountUsage {

    public static void main(String[] args) {

        ArrayList<User> user = new ArrayList<>();
        user.add(new User("Alina", "alina@gmail.com", "123*"));
        System.out.println("The user is:" + user);

        ArrayList<Address> addresses = new ArrayList<>();
        addresses.add(new Address(1, "Iasi", "Str. Garoafelor", "nr 5"));
        addresses.add(new Address(2, "Iasi", "Str. Lalelelor", "nr 2"));
        System.out.println("The addresess are: " + addresses);

        ArrayList<Product> products1 = new ArrayList<>();
        products1.add(new Product(1, "tv", 22.9));
        products1.add(new Product(2, "phone", 10.2));
       // System.out.println("The products are: " + products1);

        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order(1, ("Order1"), products1));

        ArrayList<Product> products2 = new ArrayList<>();
        products2.add(new Product(1, "vacuum cleaner", 15.1));
        products2.add(new Product(2, "laptop", 33));

        orders.add(new Order(2, ("Order2"), products2));
        System.out.println("The orders are: " + orders);

        ArrayList<Product> wishlistProducts = new ArrayList<>();
        wishlistProducts.add(new Product(1, "pc", 20.22));
        wishlistProducts.add(new Product(2, "mouse", 3.21));
        wishlistProducts.add(new Product(3, "motherboard", 2.30));
        System.out.println("The wishlist products are: " + wishlistProducts);

        ArrayList<Wishlist> wishlist = new ArrayList<>();
        wishlist.add(new Wishlist((1), wishlistProducts));
        System.out.println("The wishlist is: " + wishlist);

        ArrayList<UserAccounts> userAccounts = new ArrayList<>();
        userAccounts.add(new UserAccounts(1, user, addresses, orders, wishlist));
        System.out.println("UserAcount-ul cu datele sale personale + adrese livrare + comenzi + wishlist: " + userAccounts);

        System.out.println("The number of orders is: " + orders.size());
        System.out.println("The size of Order1 is: " + products1.size());
        System.out.println("The product on the position 1 from Order1 is: " + products1.get(0));
        System.out.println("The product on the position 2 from Order1 is: " + products1.get(1));

        System.out.println("The size of Order2 is: " + products2.size());
        System.out.println("The product on the position 1 from Order2 is: " + products2.get(0));
        System.out.println("The product on the position 2 from Order2 is: " + products2.get(1));

        System.out.println("The returned product from Order1 is: " + products1.get(0));
        products1.remove(new Product(1, "tv", 22.9));
        System.out.println("The size of Order1 after returning a product: " + products1.size());
        System.out.println("The products remained from Order1 after returning a product is: " + products1);

//        for (int index = 0; index < orders.size(); index++) {
//            System.out.println("The order from position " + index + " is: " + orders.get(index));
//        }

        System.out.println("The wishlist product on the position 1 is: " + wishlistProducts.get(0));
        System.out.println("The wishlist product on the position 2 is: " + wishlistProducts.get(1));
        System.out.println("The wishlist product on the position 3 is: " + wishlistProducts.get(2));

        System.out.println("The size of wishlist is: " + wishlistProducts.size());

        wishlistProducts.remove(2);

        System.out.println("The wishlist product on the position 1 is: " + wishlistProducts.get(0));
        System.out.println("The wishlist product on the position 2 is: " + wishlistProducts.get(1));
        System.out.println("The size of wishlist after removing the element on the position 3 is: " + wishlistProducts.size());

//        for (int index = 0; index < wishlist.size(); index++) {
//            System.out.println("The product from the wishlist on the position " + index + " is: " + wishlist.get(index));
//        }
    }
}
