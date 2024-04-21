package site.haloshop.backendtmdt.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import jakarta.persistence.*;

@Entity
@Table(name = "product_prices")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "product_id", nullable = false)
    @JsonBackReference
    private Product product;

    @Column(name = "listPrice", nullable = false, columnDefinition = "decimal(10,2)")
    private Double listPrice;

    @Column(name = "discount", nullable = false)
    private Long discount;

    @Transient
    private Double discountPrice;

    public Double getDiscountPrice() {
        return listPrice - (listPrice * discount / 100);
    }
}
