package site.haloshop.backendtmdt.entities;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import jakarta.persistence.*;
@Entity
@Table(name = "image_products")
@Data
public class ImageProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idProduct", nullable = false)
    @JsonBackReference
    private Product product;

    @Column(name = "image", columnDefinition = "mediumtext")
    private String image;
}