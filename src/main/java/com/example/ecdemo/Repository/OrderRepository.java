package com.example.ecdemo.Repository;

import com.example.ecdemo.data.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {
}
