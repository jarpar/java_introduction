package introduction;

public class SimpleTypes {
    public static void main(String[] args) {
        int age;
        age = Integer.MAX_VALUE;
        System.out.println("Wiek to " + age);

        long lottoReward = 32_000_000L;
        System.out.println("Wygrana w lotto to " + lottoReward);

        short dayOfMonth = 29;
        dayOfMonth = 23;
        System.out.println("Dzień miesiąca to " + dayOfMonth);

        final double PI = Math.PI;
        System.out.println(PI);

        boolean isPaid = false;
        System.out.println(isPaid);
        isPaid = true;
        System.out.println(isPaid);
    }
}
