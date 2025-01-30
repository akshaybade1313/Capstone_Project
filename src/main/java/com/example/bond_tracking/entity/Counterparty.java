package com.bondtracking.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Counterparty {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long counterpartyId;
    private String name;
}
