package site.haloshop.backendtmdt.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "categories")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nameCategorie", nullable = false)
    private String nameCategorie;

    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private List<SubCategory> subCategories;
}
