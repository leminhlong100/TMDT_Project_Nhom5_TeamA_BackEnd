package site.haloshop.backendtmdt.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "address")
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_account")
    private Account account;

    private String address;
}