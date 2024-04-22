package site.haloshop.backendtmdt.entities;
import lombok.Data;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "orders")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "createAt", nullable = false, columnDefinition = "datetime default current_timestamp")
    private Date createAt;

    @Column(name = "deliveryAt")
    private Date deliveryAt;

    @Column(name = "statusPay")
    private String statusPay;

    @ManyToOne
    @JoinColumn(name = "idAccount", nullable = false)
    private Account account;

    private String sale;

    @Column(name = "feeship")
    private Double feeship;

    @Column(name = "totalPrice")
    private Double totalPrice;

    private String status;

    private String address;

    @Column(name = "wardId")
    private Integer wardId;

    @Column(name = "districtId")
    private Integer districtId;

    @Column(name = "note", columnDefinition = "longtext")
    private String note;

    @ManyToOne
    @JoinColumn(name = "idEmployee")
    private Account employee;

    @Column(name = "updateAt")
    private Date updateAt;
}
