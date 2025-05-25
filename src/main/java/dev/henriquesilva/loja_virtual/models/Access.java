package dev.henriquesilva.loja_virtual.models;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;

import java.util.Objects;

@Entity
@Table(name = "access")
@SequenceGenerator(sequenceName = "seq_access", name = "seq_access", initialValue = 1, allocationSize = 1)
public class Access implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_access")
    private long id;

    @Column(unique = true, nullable = false)
    private String authority;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Access access = (Access) o;
        return id == access.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
