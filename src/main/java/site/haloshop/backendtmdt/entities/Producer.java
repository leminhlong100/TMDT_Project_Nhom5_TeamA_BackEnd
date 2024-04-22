package site.haloshop.backendtmdt.entities;
import lombok.Data;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "producers")
@Data
public class Producer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nameProducer")
    private String nameProducer;

    @Column(name = "information", columnDefinition = "mediumtext")
    private String information;

    @Column(name = "logo", columnDefinition = "mediumtext")
    private String logo;

    @Column(name = "isActive")
    private String isActive;
}
