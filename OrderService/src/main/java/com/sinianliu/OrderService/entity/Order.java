package com.sinianliu.OrderService.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;


//lombok functions:
//@Data create getter/setter
//@AllArgsConstructor create constructor with all fields
//@NoArgsConstructor create default constructor
@Entity
@Data
@Table(name = "ORDER_DETAILS")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;
    @Column(name = "PRODUCT_ID")
    private long productId;
    @Column(name = "TOTAL_Amount")
    private long totalAmount;
    @Column(name = "QUANTITY")
    private long quantity;
    @Column(name = "ORDER_DATE")
    private Instant orderDate;
    @Column(name = "STATUS")
    private String orderStatus;

}
