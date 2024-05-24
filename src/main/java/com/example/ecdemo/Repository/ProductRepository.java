package com.example.ecdemo.Repository;

import com.example.ecdemo.data.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
