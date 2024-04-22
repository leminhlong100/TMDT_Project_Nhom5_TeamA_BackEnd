package site.haloshop.backendtmdt.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "account_roles")
@Data
public class AccountRole {
    @EmbeddedId
    private AccountRoleId id;

    @ManyToOne
    @JoinColumn(name = "idAccount", insertable = false, updatable = false)
    private Account account;

    @ManyToOne
    @JoinColumn(name = "idRole", insertable = false, updatable = false)
    private Role role;

    private String name;
}
