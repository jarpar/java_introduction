package inheritance.abstraction;

public class Nokia3310 implements Phone {
    private int batteryLevel;

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public Nokia3310(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void playSnake() {
        System.out.println("Playing snake on Noia 3310");
    }

    @Override
    public void sendSms(int number, String content) {
        System.out.println("Sending SMS: " + content + "to number: " + number);
    }

    @Override
    public void makeCall(int number) {
        System.out.println("Calling to " + number + "using Nokia 3310");
    }
}
