package ro.ctrln.java;

import java.util.ArrayList;
import java.util.Objects;

public class UserAccounts {

    private int userId;
    private ArrayList<User> users;
    private ArrayList<Address> addresses;
    private ArrayList<Order> orders;
    private ArrayList<Wishlist> wishlistProducts;

    public UserAccounts(int userId, ArrayList<User> users, ArrayList<Address> addresses, ArrayList<Order> orders, ArrayList<Wishlist> wishlistProducts) {
        this.userId = userId;
        this.users = users;
        this.addresses = addresses;
        this.orders = orders;
        this.wishlistProducts = wishlistProducts;
    }

    public int userId() {
        return userId;
    }

    public void getUserId(int userId) {
        this.userId = userId;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<Address> addresses) {
        this.addresses = addresses;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public ArrayList<Wishlist> getWishlistProducts() {
        return wishlistProducts;
    }

    public void setWishlistProducts(ArrayList<Wishlist> wishlistProducts) {
        this.wishlistProducts = wishlistProducts;
    }

    @Override
    public String toString() {
        return "UserAccounts{" +
                "userId=" + userId +
                ", users=" + users +
                ", addresses=" + addresses +
                ", orders=" + orders +
                ", wishlistProducts=" + wishlistProducts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAccounts that = (UserAccounts) o;
        return userId == that.userId && users.equals(that.users) && addresses.equals(that.addresses) && orders.equals(that.orders) && wishlistProducts.equals(that.wishlistProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, users, addresses, orders, wishlistProducts);
    }
}