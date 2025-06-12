package br.com.fabex.solid.I.correct.model;

import br.com.fabex.solid.I.correct.SellOperation;

public class Supplier extends Person implements SellOperation {

    private Long supplierId;

    public Supplier(Long id, String name, Long supplierId) {
        super(id, name);
        this.supplierId = supplierId;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    @Override
    public void toSell() {
        //To sell anything...
    }
}
