package com.swipepay.core.service;

import com.swipepay.core.dto.BankDto;

import java.util.List;

public interface BankSvc {
    public List<BankDto> getAll();

    public BankDto getOne();
}
