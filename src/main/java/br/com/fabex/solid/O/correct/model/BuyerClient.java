package br.com.fabex.solid.O.correct.model;

public class BuyerClient extends ClientBase {

    private Long buyerId;

    public BuyerClient(Long id, String name) {
        super(id, name);
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    @Override
    public String welcomeMessage() {
        return "Welcome, have a great shopping experience!";
    }
}
