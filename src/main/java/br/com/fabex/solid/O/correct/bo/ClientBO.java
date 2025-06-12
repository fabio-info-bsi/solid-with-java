package br.com.fabex.solid.O.correct.bo;

import br.com.fabex.solid.O.correct.model.ClientBase;

public class ClientBO {

    public void welcome(ClientBase clientBase) {
        System.out.println(clientBase.welcomeMessage());
    }
}
