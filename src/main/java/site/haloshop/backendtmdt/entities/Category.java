package site.haloshop.backendtmdt.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
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
