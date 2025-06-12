package br.com.fabex.solid.O.wrong.bo;

import br.com.fabex.solid.O.wrong.model.ClientBase;

public class ClientBO {

    public void welcome(ClientBase clientBase) {
        System.out.println(clientBase.welcomeMessage());
    }
}
