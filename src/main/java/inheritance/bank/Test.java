package inheritance.bank;

public class Test {
    public static void main(String[] args) {
        StandardBankAccount account = new StandardBankAccount("Andrzej", 100);
        //DebitBankAccount account = new DebitBankAccount("Andrzej", 100, 100);

        System.out.println("Pobrano: " + account.withdraw(10) + " Zostało: " + account.getCashAmount());
        System.out.println("Pobrano: " + account.withdraw(20) + " Zostało: " + account.getCashAmount());
        System.out.println("Pobrano: " + account.withdraw(40) + " Zostało: " + account.getCashAmount());
        System.out.println("Pobrano: " + account.withdraw(50) + " Zostało: " + account.getCashAmount());
        System.out.println("Pobrano: " + account.withdraw(60) + " Zostało: " + account.getCashAmount());
        System.out.println("Pobrano: " + account.withdraw(80) + " Zostało: " + account.getCashAmount());
        System.out.println("Pobrano: " + account.withdraw(20) + " Zostało: " + account.getCashAmount());
    }
}
