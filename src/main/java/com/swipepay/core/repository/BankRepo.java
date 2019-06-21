package com.swipepay.core.repository;

import com.swipepay.core.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BankRepo extends JpaRepository<Bank, Integer> {
    @Query("select a from Bank a")
    public List<Object> getAll();
}
