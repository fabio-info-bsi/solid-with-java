package br.com.fabex.solid.L.wrong.bo;

import br.com.fabex.solid.L.wrong.model.Account;

public class BankingOperationApp {

    public void processWithdraw(Account account, Double money) {
        account.withdraw(money);
    }

    public void processDeposit(Account account, Double money) {
        account.deposit(money);
    }
}
