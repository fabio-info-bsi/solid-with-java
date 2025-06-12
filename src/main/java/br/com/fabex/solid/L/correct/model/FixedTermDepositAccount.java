package br.com.fabex.solid.L.correct.model;

public class FixedTermDepositAccount extends Account {
    @Override
    public void deposit(Double money) {
        System.out.println("[FixedTermDepositAccount] Depositing ...");
    }

    /* No more needed!!! */
    /*@Override
    public void withdraw(Double money) {
        throw new UnsupportedOperationException("Operation not supported!");
    }*/
}
