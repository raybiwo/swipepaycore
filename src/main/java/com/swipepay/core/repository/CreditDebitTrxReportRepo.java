package com.swipepay.core.repository;

import com.swipepay.core.model.CreditDebitTrxReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CreditDebitTrxReportRepo extends JpaRepository<CreditDebitTrxReport, Integer> {
    @Query(value = "SELECT a.db_timestamp FROM credit_debit_trx_report a, merchant_mid c " +
            "where c.mid = a.mid ORDER BY a.db_timestamp limit 1", nativeQuery = true)
    public String getAll();
}
