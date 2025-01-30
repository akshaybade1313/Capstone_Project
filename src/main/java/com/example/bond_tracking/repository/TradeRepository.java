package com.bondtracking.repository;

import com.bondtracking.entity.Trade;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface TradeRepository extends JpaRepository<Trade, Long> {
    List<Trade> findByStatus(String status);
    List<Trade> findBySettlementDateBetween(LocalDate startDate, LocalDate endDate);
}
