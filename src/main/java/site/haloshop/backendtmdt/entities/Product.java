package site.haloshop.backendtmdt.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nameProduct")
    private String nameProduct;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "idSupplier", nullable = false)
    private Supplier supplier;

    @ManyToOne
    @JoinColumn(name = "idProducer", nullable = false)
    private Producer producer;

    @ManyToOne
    @JoinColumn(name = "idCategorie", nullable = false)
    private Category category;

    @ManyToOne
    @JoinColumn(name = "idSubCategorie", nullable = false)
    private SubCategory subCategory;

    @Column(name = "isActive")
    private String isActive;

    @Column(name = "isDelete")
    private String isDelete;

    @Column(name = "status")
    private String status;

    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
    @JsonIgnore
    private ProductPrice productPrice;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ImageProduct> imageProducts;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<SizeColorProduct> sizeColorProducts;

    @OneToMany(mappedBy = "product")
    @JsonIgnore
    private List<Rate> rates;

    @OneToMany(mappedBy = "product")
    @JsonIgnore
    private List<ImportCouponDetail> importCouponDetails;

    @OneToMany(mappedBy = "product")
    @JsonIgnore
    private List<OrderDetail> orderDetails;
}
