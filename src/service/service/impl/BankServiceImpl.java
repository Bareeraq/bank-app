package service.service.impl;
import domain.Account;
import repository.AccountRepository;
import service.BankService;

import java.util.UUID;

public class BankServiceImpl implements BankService {

    private final AccountRepository accountRepository = new AccountRepository();

    @Override
    public String openAccount(String name, String email, String accountType) {
        String customerId = UUID.randomUUID().toString();

        String accountNumber = accountRepository.findAll().size() + 1;
        //String accountNumber = UUID.randomUUID().toString();
        Account account = new Account(accountNumber, accountType, (double) 0, customerId);
        //SAVE
        accountRepository.save(account);
        return accountNumber;
    }
}
