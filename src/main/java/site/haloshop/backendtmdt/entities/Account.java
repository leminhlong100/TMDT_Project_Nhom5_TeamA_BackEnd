package site.haloshop.backendtmdt.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "accounts")
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "accountName", nullable = false)
    private String accountName;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "address")
    private String address;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "isDelete", columnDefinition = "varchar(1) default '0'")
    private String isDelete;

    @Column(name = "isActive", columnDefinition = "varchar(1) default '1'")
    private String isActive;

    @Column(name = "createAt", nullable = false, columnDefinition = "datetime default current_timestamp")
    private Date createAt;

    @Column(name = "image")
    private String image;

    @Column(name = "updateAt")
    private Date updateAt;

    @Column(name = "deleteAt")
    private Date deleteAt;

    @Column(name = "type", columnDefinition = "int default '1'")
    private Integer type;

    @Column(name = "idOther")
    private String idOther;

    @Column(name = "currentPassword")
    private String currentPassword;

    @Column(name = "timestamp")
    private Date timestamp;

    @Column(name = "numberloginfail", columnDefinition = "int default '0'")
    private Integer numberloginfail;
}
