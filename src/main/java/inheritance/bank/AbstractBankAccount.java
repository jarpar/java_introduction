package inheritance.bank;

public abstract class AbstractBankAccount {
    private String owner;
    private int cashAmount;

    public AbstractBankAccount(String owner, int cashAmount) {
        this.owner = owner;
        this.cashAmount = cashAmount;
    }

    public abstract int withdraw(int amount);

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(int cashAmount) {
        this.cashAmount = cashAmount;
    }
}
