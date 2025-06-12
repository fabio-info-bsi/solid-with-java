package br.com.fabex.solid.O.correct.model;


public class VendorClient extends ClientBase {

    private Long vendorId;
    private String companyName;

    public VendorClient(Long id, String name, Long vendorId, String companyName) {
        super(id, name);
        this.vendorId = vendorId;
        this.companyName = companyName;
    }

    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String welcomeMessage() {
        return "Welcome, any problem?";
    }
}
