package site.haloshop.backendtmdt.entities;
import lombok.Data;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "discounts")
@Data
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nameDiscount")
    private String nameDiscount;

    @Column(name = "description", columnDefinition = "longtext")
    private String description;

    @Column(name = "codeDiscount", columnDefinition = "mediumtext")
    private String codeDiscount;

    @Column(name = "percentage")
    private Double percentage;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "startTime", nullable = false, columnDefinition = "datetime default current_timestamp")
    private Date startTime;

    @Column(name = "endTime")
    private Date endTime;

    @Column(name = "condition_text")
    private String condition;

    @Column(name = "status")
    private Integer status;

    @Column(name = "createAt", nullable = false, columnDefinition = "datetime default current_timestamp")
    private Date createAt;

    @Column(name = "updateAt")
    private Date updateAt;

    @Column(name = "isDelete")
    private Integer isDelete;
}