package p1_SingleResponsibility;

import java.math.BigDecimal;

public class TransactionOperations {

  // This is good as it does transactions and at right place.
  public void deposit(BigDecimal amount , int accountNumber) {
    //Getting account details it is job of account operations
    AccountOperations accountOperations = new AccountOperations();
    Account account = accountOperations.getAccount(accountNumber);
    account.setAmount(account.getAmount().add(amount));
  }

  public void withdraw(BigDecimal amount , int accountNumber) {
    AccountOperations accountOperations = new AccountOperations();
    Account account = accountOperations.getAccount(accountNumber);
    account.setAmount(account.getAmount().subtract(amount));
  }

}
