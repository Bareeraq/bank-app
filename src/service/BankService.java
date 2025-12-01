package service;
import domain.Account;

import java.util.*;

public interface BankService {
    String openAccount(String name, String email, String accountType);
    List<Account> listAccounts();

    void deposit(String accountNumber, Double amount, String note);
}

