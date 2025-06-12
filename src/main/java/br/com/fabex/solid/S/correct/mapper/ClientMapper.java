package br.com.fabex.solid.S.correct.mapper;

import br.com.fabex.solid.S.dto.ClientDTO;
import br.com.fabex.solid.S.correct.model.Client;

public class ClientMapper {

    public ClientDTO parseToClientDTO(Client client){
        String fullName = client.getFirstName() + " " + client.getMiddleName() + " " + client.getLastName();
        return new ClientDTO(fullName, client.getBirtDate());
    }

}
