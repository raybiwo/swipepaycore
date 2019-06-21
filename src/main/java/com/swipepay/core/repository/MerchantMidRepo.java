package com.swipepay.core.repository;

import com.swipepay.core.model.MerchantMid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MerchantMidRepo extends JpaRepository<MerchantMid, Integer> {
    @Query("select a from MerchantMid a")
    public List<Object> getAll();
}
