package ro.ctrln.java;

import java.util.ArrayList;

public class Wishlist{

    public static void main(String[] args) {

        ArrayList<String> wishlist = new ArrayList<>();

        wishlist.add("mixer");
        wishlist.add("toaster cleaner");
        wishlist.add("laptop");
        wishlist.add("phone case");

        System.out.println("Wishlist-ul este: " + wishlist);

        ArrayList<UserAccount> userAccount1 = new ArrayList<>();
        userAccount1.add(new UserAccount("Alina", "alina@gmail.com", "56789046", "Str. Garoafelor, nr 5", wishlist));
        System.out.println("UserAccount-ul cu datele sale este: " + userAccount1);

//        System.out.println("The element on the position 0 is: " + wishlist.get(0));
//        System.out.println("The element on the position 1 is: " + wishlist.get(1));
//        System.out.println("The element on the position 2 is: " + wishlist.get(2));
//        System.out.println("The element on the position 3 is: " + wishlist.get(3));
//
//        System.out.println("The size of wishlist after adding elements is: " + wishlist.size());
//
//        wishlist.remove(2);
//
//        System.out.println("The element on the position 0 is: " + wishlist.get(0));
//        System.out.println("The element on the position 1 is: " + wishlist.get(1));
//        System.out.println("The element on the position 2 is: " + wishlist.get(2));
//        System.out.println("The size of wishlist after removing the element on the position 2 is: " + wishlist.size());
//
//        wishlist.remove(0);
//        System.out.println("The size of wishlist after returned elements is: " + wishlist.stream());
//
//        for (int index = 0; index < wishlist.size(); index++) {
//            System.out.println("The element on the position " + index + " is: " + wishlist.get(index));
//        }
    }
}
