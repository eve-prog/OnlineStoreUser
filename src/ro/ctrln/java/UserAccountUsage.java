package ro.ctrln.java;

import java.util.ArrayList;

public class UserAccountUsage implements Orders, Wishlist{

    public static void main(String[] args) {

        ArrayList<String> orders = new ArrayList<>();

        orders.add("TV");
        orders.add("vacuum cleaner");
        orders.add("telephone");
        orders.add("electric toothbrush");

        System.out.println("Comenzile sunt: " + orders);

        ArrayList<String> wishlist = new ArrayList<>();

        wishlist.add("mixer");
        wishlist.add("toaster cleaner");
        wishlist.add("laptop");
        wishlist.add("phone case");

        System.out.println("Wishlist-ul este: " + wishlist);

        ArrayList<UserAccount> userAccount = new ArrayList<>();
        userAccount.add(new UserAccount("Alina", "alina@gmail.com", "56789046", "Str. Garoafelor, nr 5", orders, wishlist));
        System.out.println("UserAccount-ul cu datele sale este: " + userAccount);

    }

    @Override
    public String returned() {
        return null;
    }

    @Override
    public String delete() {
        return null;
    }
}
