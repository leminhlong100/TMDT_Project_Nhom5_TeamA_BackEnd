package site.haloshop.backendtmdt.entities;
import lombok.Data;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "logs")
@Data
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer level;

    private String ip;

    @ManyToOne
    @JoinColumn(name = "idAccount")
    private Account account;

    private String src;

    private String content;

    @Column(name = "createAt", nullable = false, columnDefinition = "datetime default current_timestamp")
    private Date createAt;

    private String status;

    @Column(name = "updateAt", nullable = false, columnDefinition = "datetime default current_timestamp")
    private Date updateAt;
}
