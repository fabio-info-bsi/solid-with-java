package br.com.fabex.solid.I.wrong;

public abstract class Person {
    private Long id;
    private String Name;

    public Person(Long id, String name) {
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

    public abstract void toBuy();

    public abstract void toSell();
}
