package br.com.fabex.solid.D.wrong.dao;

import br.com.fabex.solid.D.model.Client;

import java.util.List;

public class ClientDAO {

    public void insert(Client client) {
        System.out.println("Insert Client..." + client);
    }

    public void update(Client client) {
        client.setName(client.getName() + "[changed]");
        System.out.println("Update Client..." + client);
    }

    public boolean delete(Long id) {
        System.out.println("Delete Client.id: " + id);
        return true;
    }

    public List<Client> getAll() {
        return List.of();
    }
}
