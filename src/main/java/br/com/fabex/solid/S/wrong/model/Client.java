package br.com.fabex.solid.S.wrong.model;

import br.com.fabex.solid.S.dto.ClientDTO;

import java.time.LocalDate;

public class Client {
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate birtDate;

    public Client(Long id, String firstName, String middleName, String lastName, LocalDate birtDate) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birtDate = birtDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(LocalDate birtDate) {
        this.birtDate = birtDate;
    }

    /* Incorrect -> Single Responsibility Principle */
    public ClientDTO parseToClientDTO(){
        String fullName = this.firstName + " " + this.middleName + " " + this.lastName;
        return new ClientDTO(fullName, this.birtDate);
    }
}
