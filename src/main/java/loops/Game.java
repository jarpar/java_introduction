package loops;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zgadnij liczbę od 0 do 10:");
        int count = 1;
        while (true) {
            if (randomNumber == scanner.nextInt()) {
                System.out.println("Zgadłeś za " + count + " razem. Gratuluję!");
                break;
            } else {
                System.out.println("Próbuj dalej:");
                count++;
            }
        }
    }
}
