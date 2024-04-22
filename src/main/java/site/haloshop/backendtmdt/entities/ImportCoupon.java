package site.haloshop.backendtmdt.entities;
import lombok.Data;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "import_coupons")
@Data
public class ImportCoupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idSupplier")
    private Supplier supplier;

    private Date date;

    private String status;

    @ManyToOne
    @JoinColumn(name = "idProducer")
    private Producer producer;

    @Column(name = "createAt")
    private Date createAt;

    @Column(name = "updateAt")
    private Date updateAt;

    @Column(name = "deleteAt")
    private Date deleteAt;
}
