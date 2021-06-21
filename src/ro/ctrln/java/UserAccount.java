package ro.ctrln.java;

import java.util.ArrayList;
import java.util.Objects;

public class UserAccount {

    private String username;
    private String email;
    private String password;
    private String address;
    private ArrayList<String> ordersAccount;
   // private ArrayList<String> wishlistAccount;

    public UserAccount(String username, String email, String password, String address, ArrayList<String> ordersAccount/*, ArrayList<String> wishlistAccount*/) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.address = address;
        this.ordersAccount = ordersAccount;
       // this.wishlistAccount = wishlistAccount;
    }

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

    public ArrayList<String> getOrdersAccount() {
        return ordersAccount;
    }

    public void setOrdersAccount(ArrayList<String> ordersAccount) {
        this.ordersAccount = ordersAccount;
    }

//    public ArrayList<String> getWishlistAccount() {
//        return wishlistAccount;
//    }

//    public void setWishlistAccount(ArrayList<String> wishlistAccount) {
//        this.wishlistAccount = wishlistAccount;
//    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", ordersAccount=" + ordersAccount +
                /*", wishlistAccount=" + wishlistAccount +*/
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAccount that = (UserAccount) o;
        return username.equals(that.username) && email.equals(that.email) && password.equals(that.password) && address.equals(that.address) && ordersAccount.equals(that.ordersAccount); /*&& wishlistAccount.equals(that.wishlistAccount*/
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, email, password, address, ordersAccount/*, wishlistAccount*/);
    }
}