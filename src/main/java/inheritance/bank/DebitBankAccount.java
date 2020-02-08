package inheritance.bank;

public class DebitBankAccount extends AbstractBankAccount {

    private int debit;

    public DebitBankAccount(String owner, int cashAmount, int debit) {
        super(owner, cashAmount);
        this.debit = debit;
    }

    @Override
    public int withdraw(int amount) {
        return 0;
    }
}
