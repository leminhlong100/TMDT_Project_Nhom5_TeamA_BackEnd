package site.haloshop.backendtmdt.entities;
import lombok.Data;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
@Embeddable
@Data
class RoleResourceId implements Serializable {
    @Column(name = "idRole")
    private Long roleId;

    @Column(name = "idResource")
    private Long resourceId;
}