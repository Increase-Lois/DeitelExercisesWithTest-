package ChapterThree;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance){
        this.name= name;
        if (balance > 0.0) this.balance = balance;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String withdrawal(double withdrawalAmount) {
        if(withdrawalAmount > balance){
            throw new RuntimeException("Withdrawal amount exceeded account balance");
        }
        else
            balance = balance - withdrawalAmount;
            return "Withdrawal Successful";
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
    }
}
