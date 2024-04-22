package site.haloshop.backendtmdt.entities;
import lombok.Data;

import jakarta.persistence.*;
@Entity
@Table(name = "order_details")
@Data
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idOrder", nullable = false)
    private Order order;

    @ManyToOne
    @JoinColumn(name = "idProduct", nullable = false)
    private Product product;

    private Integer quantity;

    private Double price;

    private String node;

    @Column(name = "productSize")
    private String productSize;

    @Column(name = "productColor")
    private String productColor;
}
