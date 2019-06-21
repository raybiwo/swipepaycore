package com.swipepay.core.service;

import com.swipepay.core.dto.CreditDebitSettlementDto;

import java.util.List;

public interface CreditDebitSettlementSvc {
    public List<CreditDebitSettlementDto> getAll();
}
