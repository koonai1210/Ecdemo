package com.example.ecdemo.Repository;

import com.example.ecdemo.data.OrderSeq;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface OrderSeqRepository extends JpaRepository<OrderSeq, LocalDate> {
}
