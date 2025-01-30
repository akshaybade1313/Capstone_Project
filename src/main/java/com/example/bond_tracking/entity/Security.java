package com.bondtracking.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class Security {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;
    private String isin;
    private String cusip;
    private String issuerName;
    private LocalDate maturityDate;
    private double coupon;
    private String type;
    private double faceValue;
    private String currency;
    private String status;
}
