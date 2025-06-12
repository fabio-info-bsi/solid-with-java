package br.com.fabex.solid.D.correct.dao.impl;

import br.com.fabex.solid.D.correct.dao.ClientDAO;
import br.com.fabex.solid.D.model.Client;

import java.util.List;

public class ClientDAOImpl implements ClientDAO {

    @Override
    public void insert(Client client) {
        System.out.println("Insert Client..." + client);
    }

    @Override
    public void update(Client client) {
        client.setName(client.getName() + "[changed]");
        System.out.println("Update Client..." + client);
    }

    @Override
    public boolean delete(Long id) {
        System.out.println("Delete Client.id: " + id);
        return true;
    }

    @Override
    public List<Client> getAll() {
        return List.of();
    }
}
