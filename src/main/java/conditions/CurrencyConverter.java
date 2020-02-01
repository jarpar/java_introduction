package conditions;

import java.util.Scanner;

public class CurrencyConverter {
    static final float EUR = 4.31F;
    static final float USD = 3.90F;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwotę w PLN:");
        int val = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj walutę [EUR, USD]");
        String currencySymbol = scanner.nextLine().trim().toUpperCase();
        float multiplier = 0.0F;
        switch (currencySymbol) {
            case "EUR":
                multiplier = EUR;
                break;
            case "USD":
                multiplier = USD;
                break;
            default:
                System.out.println("Wrong currency " + currencySymbol);
        }
        System.out.println(val + " PLN to " + (val / multiplier) + " " + currencySymbol);
    }
}
