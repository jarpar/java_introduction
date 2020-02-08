package inheritance.bank;

public class StandardBankAccount extends AbstractBankAccount {

    public StandardBankAccount(String owner, int cashAmount) {
        super(owner, cashAmount);
    }

    @Override
    protected int getMaxAmount() {
        return getCashAmount();
    }


}