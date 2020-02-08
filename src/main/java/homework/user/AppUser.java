package homework.user;

public class AppUser {
    public static void main(String[] args) {
        User user = new User("Andrzej", "Testowy", User.Sex.male);
        user.setHeight();
        System.out.println("Wzrost użytkownika " + user.getFirstName() + " to: " + user.getHeight());
    }
}