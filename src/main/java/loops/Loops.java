package loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i + 1;
        }
        if (sum % 2 == 0 && sum % 3 == 0) {
            System.out.println(sum + " to liczba parzysta podzielna przez 3.");
        } else if (sum % 2 == 0) {
            System.out.println(sum + " to liczba parzysta niepodzielna przez 3.");
        } else {
            System.out.println(sum + " to liczba nieparzysta.");
        }
    }
}