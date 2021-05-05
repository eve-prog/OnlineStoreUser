package ro.ctrln.java;

public class UserAccount {
    private String name;
    private String email;
    private String password;
    private String address;

    public UserAccount() {
    }

    public UserAccount(String name, String email, String password, String address) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
