package inheritance.abstraction;

public class Test {
    public static void main(String[] args) {
        Phone nokia3310 = new Nokia3310(5);
        nokia3310.makeCall(123456789);
        nokia3310.sendSms(123456789, "text");
        //nokia3310.playSnake();
        //System.out.println(nokia3310.getBatteryLevel());

        Computer pc = new PC();
        pc.browseInternet("192.168.1.1");
        pc.sendEmail("user@mail.com", "text");

        SmartPhone smartPhone3 = new SmartPhone();
        Phone smartPhone = smartPhone3;

        //Phone smartPhone = new SsmartPhone();
        smartPhone.makeCall(123456789);
        smartPhone.sendSms(123456789, "text");
//        smartPhone3.browseInternet();
//        smartPhone3.sendSms();
//        smartPhone3.makeCall();
//        smartPhone3.sendEmail(); // working! when insert input data
        Computer smartphone2 = new SmartPhone();
        smartphone2.browseInternet("www.google.com");
        smartphone2.sendEmail("user@mail.com", "text");


    }
}
