package inheritance.abstraction;

public class Test {
    public static void main(String[] args) {
        Nokia3310 nokia3310 = new Nokia3310(5);
        nokia3310.makeCall(123456789);
        nokia3310.sendSms(123456789, "text");
        nokia3310.playSnake();
        System.out.println(nokia3310.getBatteryLevel());

        PC pc = new PC();
        pc.browseInternet("192.168.1.1");
        pc.sendEmail("user@mail.com", "text");
    }
}
