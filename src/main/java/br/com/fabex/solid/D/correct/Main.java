package br.com.fabex.solid.D.correct;

import br.com.fabex.solid.D.correct.bo.ClientBO;
import br.com.fabex.solid.D.correct.dao.ClientDAO;
import br.com.fabex.solid.D.correct.dao.impl.ClientDAOImpl;
import br.com.fabex.solid.D.correct.dao.impl.ClientDAOInMemoryImpl;
import br.com.fabex.solid.D.model.Client;

public class Main {

    public static void main(String[] args) {
        Client client1 = new Client(1L, "Fabex");
        Client client2 = new Client(null, "Henrique");

        //DAO Instance
        ClientDAO clientDAOImpl = new ClientDAOImpl();
        ClientDAO clientDAOInMemory = new ClientDAOInMemoryImpl();

        //BO Instance (Loosely coupled)
        ClientBO clientBO = new ClientBO(clientDAOImpl);

        clientBO.insertOrUpdate(client1);
        clientBO.insertOrUpdate(client2);


        //Another BO Instance Impl (In Memory) - Loosely coupled
        ClientBO clientBOImplInMemory = new ClientBO(clientDAOInMemory);

        System.out.println("= = = = In Memory = = = ");

        System.out.println("InMemory: " + clientBOImplInMemory.getAll());
        clientBOImplInMemory.insertOrUpdate(new Client(1L, "Fabio"));
        clientBOImplInMemory.insertOrUpdate(new Client(null, "Douglas"));
        clientBOImplInMemory.insertOrUpdate(new Client(null, "Caio"));
        var idDelete = 4L;
        boolean delete = clientBOImplInMemory.delete(idDelete);
        if (delete) {
            System.out.println("Client.id: " + idDelete + " deleted!");
        }
        System.out.println("InMemory: " + clientBOImplInMemory.getAll());

    }
}
