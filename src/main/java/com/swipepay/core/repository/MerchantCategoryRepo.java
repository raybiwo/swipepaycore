package com.swipepay.core.repository;

import com.swipepay.core.model.MerchantCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MerchantCategoryRepo extends JpaRepository<MerchantCategory, Integer> {
    @Query("select a from MerchantCategory a")
    public List<Object> getAll();
}
