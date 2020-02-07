package homework.user;

public class AppUser {
    public static void main(String[] args) {
        User user = new User("andrzej", "testowy", User.Sex.male);
        user.setHeight();
        System.out.println(user.getHeight());
    }
}