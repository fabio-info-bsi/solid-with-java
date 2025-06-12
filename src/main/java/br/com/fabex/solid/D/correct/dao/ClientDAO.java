package br.com.fabex.solid.D.correct.dao;

import br.com.fabex.solid.D.model.Client;

import java.util.List;

public interface ClientDAO {
    void insert(Client client);

    void update(Client client);

    boolean delete(Long id);

    List<Client> getAll();
}
