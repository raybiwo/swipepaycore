package com.swipepay.core.service.impl;

import com.swipepay.core.repository.BankRepo;
import com.swipepay.core.dto.BankDto;
import com.swipepay.core.service.BankSvc;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class BankSvcImpl implements BankSvc {
    @Autowired
    BankRepo bankRepo;

    @Autowired
    MapperFacade mapperFacade;

    @Override
    public List<BankDto> getAll() {
        List<BankDto> bankDtos = new ArrayList<>();
        List<Object> banks = bankRepo.getAll();

        bankDtos = mapperFacade.mapAsList(banks, BankDto.class);
        return bankDtos;
    }

    @Override
    public BankDto getOne() {
        BankDto bankDtos = new BankDto();
        Object bank = bankRepo.getOne(5);
        bankDtos = mapperFacade.map(bank, BankDto.class);
        return bankDtos;
    }
}
