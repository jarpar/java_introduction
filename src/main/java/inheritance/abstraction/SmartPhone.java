package inheritance.abstraction;

public class SmartPhone implements Computer, Phone {

    @Override
    public void sendEmail(String address, String content) {
        System.out.println("Sending email: \"" + content + "\" to: " + address + " using smartphone");
    }

    @Override
    public void browseInternet(String address) {
        System.out.println("Browsing Internet: " + address + " using smartphone");
    }

    @Override
    public void sendSms(int number, String content) {
        System.out.println("Sending SMS: \"" + content + "\" to number: " + number + " using smartphone");
    }

    @Override
    public void makeCall(int number) {
        System.out.println("Calling to " + number + " using smartphone");
    }
}
