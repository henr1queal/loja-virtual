package dev.henriquesilva.loja_virtual.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "natural_person")
@PrimaryKeyJoinColumn(name = "id")
@SequenceGenerator(name = "seq_natural_person", sequenceName = "seq_natural_person", initialValue = 1, allocationSize = 1)
public class NaturalPerson extends Person {
    private static final long serialVersionUID = 1L;

    @Column(unique=true, nullable=false)
    private String cpf;

    @Column(nullable=false)
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
