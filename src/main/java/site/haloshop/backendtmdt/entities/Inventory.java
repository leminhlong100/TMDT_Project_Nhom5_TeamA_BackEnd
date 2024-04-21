package site.haloshop.backendtmdt.entities;
import lombok.Data;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "inventorys")
@Data
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idProduct", nullable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "id_size_color", nullable = false)
    private SizeColorProduct sizeColorProduct;

    private Long quantity;

    @Column(name = "date_add", nullable = false)
    private Date dateAdd;

    @Column(name = "last_updated_date", nullable = false)
    private Date lastUpdatedDate;
}

