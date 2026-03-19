
package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tb_pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
}
