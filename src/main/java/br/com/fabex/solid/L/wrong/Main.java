package br.com.fabex.solid.L.wrong;

import br.com.fabex.solid.L.wrong.bo.BankingOperationApp;
import br.com.fabex.solid.L.wrong.model.CurrentAccount;
import br.com.fabex.solid.L.wrong.model.FixedTermDepositAccount;
import br.com.fabex.solid.L.wrong.model.SavingAccount;

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
        //Really???
        app.processWithdraw(fixedTermDepositAccount, 10D);
    }
}
