package com.example.ecdemo.Controller;


import com.example.ecdemo.ProductService;
import com.example.ecdemo.data.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product addNewProduct = productService.addProduct(product);
        //System.out.println("ok");
        return new ResponseEntity<>(addNewProduct, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return new ResponseEntity<>(products,HttpStatus.OK);
    }
}
