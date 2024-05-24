package com.example.ecdemo;

import com.example.ecdemo.Repository.OrderRepository;
import com.example.ecdemo.Repository.OrderSeqRepository;
import com.example.ecdemo.data.Order;
import com.example.ecdemo.data.OrderSeq;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class OrderService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    OrderSeqRepository orderSeqRepository;

    @Transactional
    public Order createOrder(Order order) {
        String orderid=generateorderId();
        order.setId(orderid);
        return orderRepository.save(order);
    }
    @Transactional
    public List<Order> getAllorders(){
        return orderRepository.findAll();
    }

    private String generateorderId() {
        LocalDate currentDate = LocalDate.now();
        String formattedDate= currentDate.format(DateTimeFormatter.ofPattern("yyyyMMdd"));

        OrderSeq orderSeq = orderSeqRepository.findById(currentDate)
                .orElseGet(() -> {
                    OrderSeq newOrderSeq = new OrderSeq();
                    newOrderSeq.setSeqDate(currentDate);
                    newOrderSeq.setSeq(0);
                    return newOrderSeq;
                });

        int no=orderSeq.getSeq()+1;
        orderSeq.setSeq(no);
        orderSeqRepository.save(orderSeq);
        return formattedDate+String.format("%04d",no);
    }
}
