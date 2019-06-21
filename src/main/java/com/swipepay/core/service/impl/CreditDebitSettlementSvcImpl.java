package com.swipepay.core.service.impl;

import com.swipepay.core.dto.CreditDebitSettlementDto;
import com.swipepay.core.model.CreditDebitSettlement;
import com.swipepay.core.repository.CreditDebitSettlementRepo;
import com.swipepay.core.service.CreditDebitSettlementSvc;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CreditDebitSettlementSvcImpl implements CreditDebitSettlementSvc {

    @Autowired
    CreditDebitSettlementRepo creditDebitSettlementRepo;

    @Autowired
    MapperFacade mapperFacade;

    @Override
    public List<CreditDebitSettlementDto> getAll() {
        List<CreditDebitSettlementDto> creditDebitSettlementDtos = new ArrayList<>();
        List<Object> creditDebitSettlements = creditDebitSettlementRepo.getAll();
        creditDebitSettlementDtos = mapperFacade.mapAsList(creditDebitSettlements, CreditDebitSettlementDto.class);
        return creditDebitSettlementDtos;
    }
}
