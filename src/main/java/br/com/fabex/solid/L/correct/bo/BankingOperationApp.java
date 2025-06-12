package br.com.fabex.solid.L.correct.bo;

import br.com.fabex.solid.L.correct.model.Account;
import br.com.fabex.solid.L.correct.model.WithdrawableAccount;

public class BankingOperationApp {

    public void processWithdraw(WithdrawableAccount account, Double money) {
        account.withdraw(money);
    }

    public void processDeposit(Account account, Double money) {
        account.deposit(money);
    }
}
