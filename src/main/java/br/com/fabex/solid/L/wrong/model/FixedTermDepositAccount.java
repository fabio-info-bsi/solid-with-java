package br.com.fabex.solid.L.wrong.model;

public class FixedTermDepositAccount extends Account{
    @Override
    public void deposit(Double money) {
        System.out.println("[FixedTermDepositAccount] Depositing ...");
    }

    @Override
    public void withdraw(Double money) {
        /* Violate Liskov Substitution Principle */
        throw new UnsupportedOperationException("Operation not supported!");
    }
}
