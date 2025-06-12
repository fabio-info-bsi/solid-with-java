package br.com.fabex.solid.L.wrong.model;

public class SavingAccount extends Account {
    @Override
    public void deposit(Double money) {
        System.out.println("[SavingAccount] Depositing ...");
    }

    @Override
    public void withdraw(Double money) {
        System.out.println("[SavingAccount] Withdrawing ...");
    }
}
