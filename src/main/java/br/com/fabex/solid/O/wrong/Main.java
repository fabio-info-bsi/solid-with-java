package br.com.fabex.solid.O.wrong;

import br.com.fabex.solid.O.enums.Department;
import br.com.fabex.solid.O.wrong.bo.ClientBO;
import br.com.fabex.solid.O.wrong.model.BuyerClient;
import br.com.fabex.solid.O.wrong.model.SalerClient;
import br.com.fabex.solid.O.wrong.model.VendorClient;

public class Main {
    public static void main(String[] args) {
        BuyerClient buyerClient = new BuyerClient(1L, "B");
        SalerClient salerClient = new SalerClient(2L, "S", 1L, Department.TI);
        VendorClient vendorClient = new VendorClient(3L, "V", 1L, "TI");

        ClientBO clientBO = new ClientBO();

        clientBO.welcome(salerClient);
        clientBO.welcome(vendorClient);
        /* Uh, Welcome! [Impl new Client Type] - Violate Open/Closed Principle */
        clientBO.welcome(buyerClient);
    }
}
