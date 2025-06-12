package br.com.fabex.solid.D.wrong.bo;

import br.com.fabex.solid.D.model.Client;
import br.com.fabex.solid.D.wrong.dao.ClientDAO;

import java.util.Objects;

public class ClientBO {

    /* Tightly coupled - Dependency Inversion Principle */
    private final ClientDAO clientDAO;

    public ClientBO(ClientDAO clientDAO) {
        this.clientDAO = clientDAO;
    }

    public void insertOrUpdate(Client client) {
        if (Objects.nonNull(client.getId()) && client.getId() != 0) {
            this.clientDAO.update(client);
            return;
        }
        clientDAO.insert(client);
    }

    public boolean delete(Long id) {
        return clientDAO.delete(id);
    }
}
