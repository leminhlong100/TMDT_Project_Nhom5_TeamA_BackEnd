package site.haloshop.backendtmdt.entities;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import jakarta.persistence.*;
@Entity
@Table(name = "size_color_products")
@Data
public class SizeColorProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idProduct", nullable = false)
    @JsonBackReference
    private Product product;

    private String size;

    private String color;
}
