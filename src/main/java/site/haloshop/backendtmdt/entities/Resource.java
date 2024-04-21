package site.haloshop.backendtmdt.entities;
import lombok.Data;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "resources")
@Data
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String url;

    private String description;
}