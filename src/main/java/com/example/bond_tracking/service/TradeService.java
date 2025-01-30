package com.bondtracking.service;

import com.bondtracking.entity.Trade;
import com.bondtracking.repository.TradeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TradeService {
    private final TradeRepository tradeRepository;

    public List<Trade> getAllOpenTrades() {
        return tradeRepository.findByStatus("OPEN");
    }

    public List<Trade> getMaturingTrades() {
        LocalDate today = LocalDate.now();
        return tradeRepository.findBySettlementDateBetween(today, today.plusDays(5));
    }
}
