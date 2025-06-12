package br.com.fabex.solid.L.wrong.model;

public class CurrentAccount extends Account {
    @Override
    public void deposit(Double money) {
        System.out.println("[CurrentAccount] Depositing ...");
    }

    @Override
    public void withdraw(Double money) {
        System.out.println("[CurrentAccount] Withdrawing ...");
    }
}
