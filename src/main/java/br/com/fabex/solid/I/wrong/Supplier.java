package br.com.fabex.solid.I.wrong;

public class Supplier extends Person{

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
    public void toBuy() {
        /* It hurt Interface Segregation Principle */
        throw new UnsupportedOperationException();
    }

    @Override
    public void toSell() {
        //To sell anything...
    }
}
