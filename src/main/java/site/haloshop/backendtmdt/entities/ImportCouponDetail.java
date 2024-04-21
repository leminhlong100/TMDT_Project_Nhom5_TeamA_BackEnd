package site.haloshop.backendtmdt.entities;
import lombok.Data;
import jakarta.persistence.*;
import java.util.Date;
@Entity
@Table(name = "import_coupons_details")
@Data
public class ImportCouponDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idImportCoupon", nullable = false)
    private ImportCoupon importCoupon;

    @ManyToOne
    @JoinColumn(name = "idProduct")
    private Product product;

    private Double price;

    private Long quantity;

    @Column(name = "createAt")
    private Date createAt;

    @Column(name = "updateAt")
    private Date updateAt;

    @Column(name = "deleteAt")
    private Date deleteAt;
}