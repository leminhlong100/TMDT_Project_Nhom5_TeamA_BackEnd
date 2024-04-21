package site.haloshop.backendtmdt.entities;
import lombok.Data;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "sub_categories")
@Data
public class SubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nameSubCategorie", nullable = false)
    private String nameSubCategorie;

    @ManyToOne
    @JoinColumn(name = "idCategorie", nullable = false)
    private Category category;
}
