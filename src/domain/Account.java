package domain;

public class Account {
    private String accountNumber;
    private String customerId;
    private Double balance;
    private String type;

    public Account(String accountNumber, String type, Double balance, String customerId) {
        this.accountNumber = accountNumber;
        this.customerId = customerId;
        this.balance = balance;
        this.type = type;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return type;
    }

    public void setAccountType(String accountType) {
        this.type = accountType;
    }
}
