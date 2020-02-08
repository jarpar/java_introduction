package inheritance.bank;

public class StandardBankAccount extends AbstractBankAccount {

    public StandardBankAccount(String owner, int cashAmount) {
        super(owner, cashAmount);
    }

    @Override
    public int withdraw(int amount) {
        if (getCashAmount() >= amount) {
            setCashAmount(getCashAmount() - amount);
            return amount;
        } else {
            System.out.println("Nie masz wystarczającej kwoty na koncie. Pozostało: " + getCashAmount());
            return 0;
        }
    }
}