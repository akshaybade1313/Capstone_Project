package com.bondtracking.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class Trade {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tradeId;

    @ManyToOne
    private Book book;

    @ManyToOne
    private Counterparty counterparty;

    private String securityId;
    private String currency;
    private String status;
    private int quantity;
    private double unitPrice;
    private LocalDate tradeDate;
    private LocalDate settlementDate;
    private String buySellIndicator;
}
