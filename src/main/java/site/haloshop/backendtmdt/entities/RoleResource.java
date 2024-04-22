package site.haloshop.backendtmdt.entities;
import lombok.Data;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "role_resource")
@Data
public class RoleResource {
    @EmbeddedId
    private RoleResourceId id;

    @ManyToOne
    @JoinColumn(name = "idRole", insertable = false, updatable = false)
    private Role role;

    @ManyToOne
    @JoinColumn(name = "idResource", insertable = false, updatable = false)
    private Resource resource;
}