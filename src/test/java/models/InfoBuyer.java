package models;

import java.util.Objects;

public class InfoBuyer {
    private String firstName;
    private String lastName;
    private String code;

    public InfoBuyer() {
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getCode() {
        return code;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setCode(String code) {
        this.code = code;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InfoBuyer infoBuyer = (InfoBuyer) o;
        return Objects.equals(firstName, infoBuyer.firstName) && Objects.equals(lastName, infoBuyer.lastName) && Objects.equals(code, infoBuyer.code) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, code);
    }

    @Override
    public String toString() {
        return "InfoBuyer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}