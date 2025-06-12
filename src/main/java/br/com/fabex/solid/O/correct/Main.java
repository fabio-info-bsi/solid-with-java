package br.com.fabex.solid.O.correct;

import br.com.fabex.solid.O.enums.Department;
import br.com.fabex.solid.O.correct.bo.ClientBO;
import br.com.fabex.solid.O.correct.model.BuyerClient;
import br.com.fabex.solid.O.correct.model.SalerClient;
import br.com.fabex.solid.O.correct.model.VendorClient;

public class Main {

    public static void main(String[] args) {
        BuyerClient buyerClient = new BuyerClient(1L, "B");
        SalerClient salerClient = new SalerClient(2L, "S", 1L, Department.TI);
        VendorClient vendorClient = new VendorClient(3L, "V", 1L, "TI");

        ClientBO clientBO = new ClientBO();

        clientBO.welcome(salerClient);
        clientBO.welcome(vendorClient);
        clientBO.welcome(buyerClient);
    }
}
