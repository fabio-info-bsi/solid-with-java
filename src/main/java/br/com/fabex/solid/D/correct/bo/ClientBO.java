package br.com.fabex.solid.D.correct.bo;

import br.com.fabex.solid.D.correct.dao.ClientDAO;
import br.com.fabex.solid.D.model.Client;

import java.util.List;
import java.util.Objects;

public class ClientBO {

    /* Loosely coupled \o/ */
    private final ClientDAO clientDAO;

    public ClientBO(ClientDAO clientDAO) {
        this.clientDAO = clientDAO;
    }

    public void insertOrUpdate(Client client) {
        if (Objects.nonNull(client.getId())) {
            this.clientDAO.update(client);
            return;
        }
        clientDAO.insert(client);
    }

    public boolean delete(Long id) {
        return clientDAO.delete(id);
    }

    public List<Client> getAll(){
        return clientDAO.getAll();
    }
}
