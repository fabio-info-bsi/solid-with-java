package br.com.fabex.solid.D.correct.dao.impl;

import br.com.fabex.solid.D.correct.dao.ClientDAO;
import br.com.fabex.solid.D.model.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class ClientDAOInMemoryImpl implements ClientDAO {

    private final AtomicLong incrementId = new AtomicLong(5);
    private final List<Client> listClientInMemory = new ArrayList<>(
            List.of(
                    new Client(1L, "Fabex"),
                    new Client(2L, "Davi"),
                    new Client(3L, "Edgar"),
                    new Client(4L, "Claudio")
            )
    );

    @Override
    public void insert(Client client) {
        if (listClientInMemory.contains(client)) {
            throw new RuntimeException("Already exist client.id: " + client.getId());
        }
        System.out.println("Insert Client..." + client);
        client.setId(incrementId.getAndIncrement());
        listClientInMemory.add(client);
    }

    @Override
    public void update(Client client) {
        listClientInMemory.stream()
                .filter(cli -> cli.equals(client))
                .findFirst()
                .ifPresentOrElse(
                        cli -> {
                            cli.setName(client.getName() + "[changed]");
                            System.out.println("Update Client..." + client);
                        },
                        () -> {
                            throw new RuntimeException("Not found client.id: " + client.getId());
                        }
                );


    }

    @Override
    public boolean delete(Long id) {
        Client client = listClientInMemory.stream()
                .filter(cli -> cli.equals(new Client(id)))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Not found client.id: " + id));
        System.out.println("Delete Client.id: " + id);
        return listClientInMemory.remove(client);
    }

    @Override
    public List<Client> getAll() {
        return this.listClientInMemory.stream().toList();
    }
}
