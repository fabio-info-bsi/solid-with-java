package br.com.fabex.solid.D.wrong;

import br.com.fabex.solid.D.model.Client;
import br.com.fabex.solid.D.wrong.bo.ClientBO;
import br.com.fabex.solid.D.wrong.dao.ClientDAO;

public class Main {

    public static void main(String[] args) {
        //Models
        Client client1 = new Client(1L, "Fabex");
        Client client2 = new Client(null, "Henrique");

        //DAO Instance
        ClientDAO clientDAO = new ClientDAO();

        //BO Instance
        ClientBO clientBO = new ClientBO(clientDAO);

        clientBO.insertOrUpdate(client1);
        clientBO.insertOrUpdate(client2);
    }
}
