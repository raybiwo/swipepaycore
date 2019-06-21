package com.swipepay.core.repository;

import com.swipepay.core.model.Bank;
import com.swipepay.core.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DeviceRepo extends JpaRepository<Device, Integer> {
    @Query("select a from Device a")
    public List<Object> getAll();
}
