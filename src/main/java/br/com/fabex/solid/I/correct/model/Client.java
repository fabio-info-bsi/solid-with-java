package br.com.fabex.solid.I.correct.model;

import br.com.fabex.solid.I.correct.BuyOperation;

public class Client extends Person implements BuyOperation {

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
}
