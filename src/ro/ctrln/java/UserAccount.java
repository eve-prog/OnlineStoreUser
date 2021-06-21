package ro.ctrln.java;

import java.util.Objects;

public class UserAccount {

    private String username;
    private String email;
    private String password;
    private String address;
    private Orders orders;
    private Wishlist wishlist;

    public UserAccount(String username, String email, String password, String address) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.address = address;
    }

//    public UserAccount(String username, String email, String password, String address, Orders orders, Wishlist wishlist) {
//        this.username = username;
//        this.email = email;
//        this.password = password;
//        this.address = address;
//        this.orders = orders;
//        this.wishlist = wishlist;
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Wishlist getWishlist() {
        return wishlist;
    }

    public void setWishlist(Wishlist wishlist) {
        this.wishlist = wishlist;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                /*", orders=" + orders +
                ", wishlist=" + wishlist +*/
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAccount that = (UserAccount) o;
        return username.equals(that.username) && email.equals(that.email) && password.equals(that.password) && address.equals(that.address) /*&& orders.equals(that.orders) && wishlist.equals(that.wishlist)*/;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, email, password, address/*, orders, wishlist*/);
    }


}