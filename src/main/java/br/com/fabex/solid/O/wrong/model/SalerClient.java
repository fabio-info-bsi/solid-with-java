package br.com.fabex.solid.O.wrong.model;


import br.com.fabex.solid.O.enums.Department;

public class SalerClient extends ClientBase{
    private Long salerId;
    private Department department;

    public SalerClient(Long id, String name, Long salerId, Department department) {
        super(id, name);
        this.salerId = salerId;
        this.department = department;
    }

    public Long getSalerId() {
        return salerId;
    }

    public void setSalerId(Long salerId) {
        this.salerId = salerId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
