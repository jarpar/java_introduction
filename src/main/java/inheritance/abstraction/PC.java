package inheritance.abstraction;

public class PC implements Computer {

    @Override
    public void sendEmail(String address, String content) {
        System.out.println("Sending email: \"" + content + "\" to: " + address);
    }

    @Override
    public void browseInternet(String address) {
        System.out.println("Browsing Internet: " + address + " using PC");
    }
}
