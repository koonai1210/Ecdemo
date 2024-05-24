package com.example.ecdemo.data;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  String id;
    private Integer member_id;
    private BigDecimal total;
    private Integer paystatus;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getMember_id() {
        return member_id;
    }

    public void setMember_id(Integer member_id) {
        this.member_id = member_id;
    }

    public Integer getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(Integer paystatus) {
        this.paystatus = paystatus;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
