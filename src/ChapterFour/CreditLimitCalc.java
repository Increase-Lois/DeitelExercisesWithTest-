package ChapterFour;

public class CreditLimitCalc {
    private int accountNumber;
    private int beginningBalance;
    private int itemCharged;
    private int monthlyCredit;
    private int allowedCreditLimit;

    public CreditLimitCalc(int accountNumber, int beginningBalance, int itemCharged, int monthlyCredit, int allowedCreditLimit) {
        this.accountNumber = accountNumber;
        this.beginningBalance = beginningBalance;
        this.itemCharged = itemCharged;
        this.monthlyCredit = monthlyCredit;
        this.allowedCreditLimit = allowedCreditLimit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBeginningBalance() {
        return beginningBalance;
    }

    public void setBeginningBalance(int beginningBalance) {
        this.beginningBalance = beginningBalance;
    }

    public int getItemCharged() {
        return itemCharged;
    }

    public void setItemCharged(int itemCharged) {
        this.itemCharged = itemCharged;
    }

    public int getMonthlyCredit() {
        return monthlyCredit;
    }

    public void setMonthlyCredit(int monthlyCredit) {
        this.monthlyCredit = monthlyCredit;
    }

    public int getAllowedCreditLimit() {
        return allowedCreditLimit;
    }

    public void setAllowedCreditLimit(int allowedCreditLimit) {
        this.allowedCreditLimit = allowedCreditLimit;
    }


    public double calcBalance() {
        return beginningBalance + itemCharged - monthlyCredit;
    }
}
