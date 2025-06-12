package br.com.fabex.solid.L.correct.model;

public class CurrentAccount extends WithdrawableAccount {
    @Override
    public void deposit(Double money) {
        System.out.println("[CurrentAccount] Depositing ...");
    }

    @Override
    public void withdraw(Double money) {
        System.out.println("[CurrentAccount] Withdrawing ...");
    }
}
