package site.haloshop.backendtmdt.entities;
import lombok.Data;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "suppliers")
@Data
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nameSupplier")
    private String nameSupplier;

    @Column(name = "emailSupplier")
    private String emailSupplier;

    private String phone;

    private String isActive;

    @Column(name = "createAt")
    private Date createAt;
}