package br.com.fabex.solid.L.correct.model;

public class SavingAccount extends WithdrawableAccount {
    @Override
    public void deposit(Double money) {
        System.out.println("[SavingAccount] Depositing ...");
    }

    @Override
    public void withdraw(Double money) {
        System.out.println("[SavingAccount] Withdrawing ...");
    }
}
