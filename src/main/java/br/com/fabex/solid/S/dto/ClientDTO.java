package br.com.fabex.solid.S.dto;

import java.time.LocalDate;

public class ClientDTO {
    private String fullName;
    private LocalDate birtDate;

    public ClientDTO() {
    }

    public ClientDTO(String fullName, LocalDate birtDate) {
        this.fullName = fullName;
        this.birtDate = birtDate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(LocalDate birtDate) {
        this.birtDate = birtDate;
    }
}
