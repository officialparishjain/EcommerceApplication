package com.parishjain.EcommerceApplication.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private Integer orderProductQuantity;

    // HERE I HAVE USE MANY TO ONE MAPPING BECAUSE MANY ORDERS CAN BE OF ONE USER
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    private User user;

    // HERE I HAVE USED MANY TO ONE BECAUSE MANY ORDERS CAN BE OF ONE PRODUCT
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private Product product;

    // HERE I HAVE USED MANY TO ONE BECAUSE MANY ORDERS CAN HAVE ONE ADDRESS
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

}
