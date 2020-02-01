package conditions;

import java.util.Scanner;

public class ConditionInstructions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cześć! Jak masz na imię?");
        String name = scanner.nextLine().trim();
        System.out.println(name + ", posiadasz wspaniałe imię:)");
        if (name.endsWith("a")) {
            System.out.println("Zgaduję, że jesteś kobietą.");
        } else {
            System.out.println("Zgaduję, że jesteś mężczyzną.");
        }
        System.out.println("Ile masz lat?");
        int age = scanner.nextInt();
        String ending = new String();
        if (age < 10 || age > 20) {
            switch (age % 10) {
                case 2:
                case 3:
                case 4:
                    ending = " lata.";
                    break;
                default:
                    ending = " lat.";
            }
        }
        System.out.println("Fajnie, że masz " + age + ending);
        if (age >= 21) {
            System.out.println("Jesteś osobą dorosłą w USA!");
        } else if (age >= 18) {
            System.out.println("Jesteś osobą dorosłą w Polsce!");
        } else {
            System.out.println("Jesteś niepełnoletni.");
        }
    }
}
