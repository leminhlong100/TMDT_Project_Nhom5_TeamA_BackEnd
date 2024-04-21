package site.haloshop.backendtmdt.entities;
import lombok.Data;

import jakarta.persistence.*;
@Entity
@Table(name = "views")
@Data
public class View {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idProduct", nullable = false)
    private Product product;

    private String status;

    @ManyToOne
    @JoinColumn(name = "idCustomer", nullable = false)
    private Account customer;
}
