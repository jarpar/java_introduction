package inheritance.abstraction;

public class PC implements Computer {

    @Override
    public void sendEmail(String address, String content) {
        System.out.println("Sending email to: " + address + " which contents: " + content);
    }

    @Override
    public void browseInternet(String address) {
        System.out.println("Browsing Internet:" + address + " using PC");
    }
}
