package dev.henriquesilva.loja_virtual.models;

import jakarta.persistence.*;

@Entity
@Table(name = "legal_person")
@PrimaryKeyJoinColumn(name = "id")
public class LegalPerson extends Person {
    private static final long serialVersionUID = 1L;

    @Column(unique = true, nullable = false)
    private String cnpj;
    @Column(unique = true)
    private String stateRegistration;
    @Column(unique = true)
    private String municipalRegistration;
    @Column(nullable = false)
    private String fantasyName;
    @Column(nullable = false)
    private String legalName ;
    @Column(nullable = false)
    private String category;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getStateRegistration() {
        return stateRegistration;
    }

    public void setStateRegistration(String stateRegistration) {
        this.stateRegistration = stateRegistration;
    }

    public String getMunicipalRegistration() {
        return municipalRegistration;
    }

    public void setMunicipalRegistration(String municipalRegistration) {
        this.municipalRegistration = municipalRegistration;
    }

    public String getFantasyName() {
        return fantasyName;
    }

    public void setFantasyName(String fantasyName) {
        this.fantasyName = fantasyName;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
