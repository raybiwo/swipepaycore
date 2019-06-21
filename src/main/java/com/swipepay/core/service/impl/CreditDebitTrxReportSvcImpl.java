package com.swipepay.core.service.impl;

import com.swipepay.core.dto.CreditDebitTrxReportDto;
import com.swipepay.core.repository.CreditDebitTrxReportRepo;
import com.swipepay.core.service.CreditDebitTrxReportSvc;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CreditDebitTrxReportSvcImpl implements CreditDebitTrxReportSvc {

    @Autowired
    CreditDebitTrxReportRepo creditDebitTrxReportRepo;

    @Autowired
    MapperFacade mapperFacade;

    @Override
    public String getAll() {
        List<CreditDebitTrxReportDto> creditDebitTrxReportDtos = new ArrayList<>();
        String test = creditDebitTrxReportRepo.getAll();
        //creditDebitTrxReportDtos = mapperFacade.mapAsList(creditDebitTrxReports, CreditDebitTrxReportDto.class);
        return test;
    }
}
