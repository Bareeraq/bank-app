package domain;

import java.time.LocalDateTime;

public class Transaction {
    private String id;
    private Type type;
    private String accountNumber;
    private Double amount;
    private LocalDateTime timestamp;
    private String note;

    public Transaction(String id, Type type, Double amount, LocalDateTime timestamp, String note, String accountNumber) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.timestamp = this.timestamp;
        this.note = note;
        this.accountNumber = accountNumber;
    }
}
