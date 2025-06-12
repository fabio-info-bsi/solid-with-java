package br.com.fabex.solid.I.wrong;

public class Saler extends Person {

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
    public void toBuy() {
        /* It hurt Interface Segregation Principle */
        throw new UnsupportedOperationException();
    }

    @Override
    public void toSell() {
        //To sell anything...
    }
}
