package site.haloshop.backendtmdt.entities;

import lombok.Data;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "comments")
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "content", nullable = false, columnDefinition = "longtext")
    private String content;

    @ManyToOne
    @JoinColumn(name = "idCustomer", nullable = false)
    private Account customer;

    @ManyToOne
    @JoinColumn(name = "idProduct", nullable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "idParent")
    private Comment parentComment;

    @Column(name = "createAt", columnDefinition = "datetime default current_timestamp")
    private Date createAt;

    @Column(name = "updateAt")
    private Date updateAt;

    @Column(name = "deleteAt")
    private Date deleteAt;

    private String status;

    private Integer level;

    private String nameAccount;
}