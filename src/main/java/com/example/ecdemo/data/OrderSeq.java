package com.example.ecdemo.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class OrderSeq {

    @Id
    private LocalDate seqDate;
    private int seq;

    public OrderSeq() {

    }

    public OrderSeq(LocalDate currentDate, int i) {
    }

    public LocalDate getSeqDate() {
        return seqDate;
    }

    public void setSeqDate(LocalDate seqDate) {
        this.seqDate = seqDate;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }
}
