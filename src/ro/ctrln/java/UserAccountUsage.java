package ro.ctrln.java;

public class UserAccountUsage {
    public static void main(String[] args) {
        OrdersList<UserAccount> users = new OrdersList<>();

        users.addElement(new UserAccount("Adi", "adi@gmail.com", "12345666", "Str. Lalelor, nr 4"));
        users.addElement(new UserAccount("Alina", "alina@gmail.com", "56789046", "Str. Garoafelor, nr 5"));
        users.addElement(new UserAccount("Marian", "marian@gmail.com", "34561236", "Str. Crinilor, nr 2"));

        System.out.println("The size of users is: " + users.getSize());

        // users.removeElement(2);
       // System.out.println("The size of users after removing is: " + users.getSize());

        for (int index = 0; index < users.getSize(); index++) {
            System.out.println("The user on position " + index + " is: " + users.getElement(index));
        }
    }
}
