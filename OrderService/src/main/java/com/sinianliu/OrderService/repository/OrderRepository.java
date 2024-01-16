package com.sinianliu.OrderService.repository;

import com.sinianliu.OrderService.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//for entity: Product , id type: Long
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
