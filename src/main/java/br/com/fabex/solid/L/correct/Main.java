package br.com.fabex.solid.L.correct;

import br.com.fabex.solid.L.correct.bo.BankingOperationApp;
import br.com.fabex.solid.L.correct.model.CurrentAccount;
import br.com.fabex.solid.L.correct.model.FixedTermDepositAccount;
import br.com.fabex.solid.L.correct.model.SavingAccount;

public class Main {

    public static void main(String[] args) {
        //Accounts
        CurrentAccount currentAccount = new CurrentAccount();
        SavingAccount savingAccount = new SavingAccount();
        FixedTermDepositAccount fixedTermDepositAccount = new FixedTermDepositAccount();

        //Operations
        BankingOperationApp app = new BankingOperationApp();

        //Depositing
        app.processDeposit(currentAccount, 10D);
        app.processDeposit(savingAccount, 10D);
        app.processDeposit(fixedTermDepositAccount, 10D);

        //Withdrawing
        app.processWithdraw(currentAccount, 10D);
        app.processWithdraw(savingAccount, 10D);
        //Don't have Withdrawn operation
        //app.processWithdraw(fixedTermDepositAccount, 10D);
    }
}
