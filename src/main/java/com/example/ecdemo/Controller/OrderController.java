package com.example.ecdemo.Controller;

import com.example.ecdemo.OrderService;
import com.example.ecdemo.data.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping
    public ResponseEntity<Order> addOrder(@RequestBody Order order) {
        Order createOrder=orderService.createOrder(order);
        System.out.println("ok");
        return new ResponseEntity<>(createOrder, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Order>> getAllOrders() {
        List<Order> orders=orderService.getAllorders();
        return new ResponseEntity<>(orders, HttpStatus.OK);

    }
}
