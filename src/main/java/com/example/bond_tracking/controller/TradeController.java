package com.bondtracking.controller;

import com.bondtracking.entity.Trade;
import com.bondtracking.service.TradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trades")
@RequiredArgsConstructor
public class TradeController {
    private final TradeService tradeService;

    @GetMapping("/open")
    public ResponseEntity<List<Trade>> getOpenTrades() {
        return ResponseEntity.ok(tradeService.getAllOpenTrades());
    }

    @GetMapping("/maturing")
    public ResponseEntity<List<Trade>> getMaturingTrades() {
        return ResponseEntity.ok(tradeService.getMaturingTrades());
    }
}
