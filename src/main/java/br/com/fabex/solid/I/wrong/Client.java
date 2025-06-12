package br.com.fabex.solid.I.wrong;

public class Client extends Person{

    private Long clientId;

    public Client(Long id, String name, Long clientId) {
        super(id, name);
        this.clientId = clientId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    @Override
    public void toBuy() {
        //To buy anything...
    }

    @Override
    public void toSell() {
        /* It hurt Interface Segregation Principle */
        throw new UnsupportedOperationException();
    }
}
