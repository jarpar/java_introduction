package introduction;

import java.util.Locale;

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
        String isPaidTxt = isPaid ? "Tak" : "Nie";
        System.out.println(isPaidTxt);
        isPaid = true;
        isPaidTxt = isPaid ? "Tak" : "Nie";
        System.out.println(isPaidTxt);

        String name = null;
        name = "Jarek";
        System.out.println(name.toUpperCase(Locale.ENGLISH) + " " + name.length());

        char thirdLetter = name.charAt(2);
        System.out.println(thirdLetter);
    }
}
