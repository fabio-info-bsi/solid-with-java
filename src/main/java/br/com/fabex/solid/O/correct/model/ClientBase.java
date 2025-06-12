package br.com.fabex.solid.O.correct.model;


public abstract class ClientBase {

    private Long id;
    private String Name;

    public ClientBase(Long id, String name) {
        this.id = id;
        Name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public abstract String welcomeMessage();
}
