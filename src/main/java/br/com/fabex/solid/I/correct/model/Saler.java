package br.com.fabex.solid.I.correct.model;

import br.com.fabex.solid.I.correct.SellOperation;

public class Saler extends Person implements SellOperation {

    private Long salerId;

    public Saler(Long id, String name) {
        super(id, name);
    }

    public Long getSalerId() {
        return salerId;
    }

    public void setSalerId(Long salerId) {
        this.salerId = salerId;
    }

    @Override
    public void toSell() {
        //To sell anything...
    }
}
