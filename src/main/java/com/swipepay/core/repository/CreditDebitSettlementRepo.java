package com.swipepay.core.repository;

import com.swipepay.core.model.CreditDebitSettlement;
import com.swipepay.core.model.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CreditDebitSettlementRepo extends JpaRepository<CreditDebitSettlement, Integer> {
    @Query("SELECT a FROM CreditDebitSettlement a ")
    public List<Object> getAll();
}
