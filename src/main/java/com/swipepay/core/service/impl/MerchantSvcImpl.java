package com.swipepay.core.service.impl;

import com.swipepay.core.dto.MerchantDto;
import com.swipepay.core.dto.MerchantReportDto;
import com.swipepay.core.repository.MerchantRepo;
import com.swipepay.core.service.MerchantSvc;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class MerchantSvcImpl implements MerchantSvc {

    @Autowired
    MerchantRepo merchantRepo;

    @Autowired
    MapperFacade mapperFacade;

    @Override
    public Map<String, Object> getMerchantReport() {
        List<MerchantReportDto> merchantDtos = new ArrayList<>();
        List<Object[]> qr = merchantRepo.getMerchantReport();

        for (Object[] obj: qr) {
            MerchantReportDto merchantReportDto = new MerchantReportDto();

            merchantReportDto.setMerchantName((String) obj[0]);
            merchantReportDto.setSalesCode((String) obj[1]);
            merchantReportDto.setCategory((String) obj[2]);
            merchantReportDto.setMid((String) obj[3]);
            merchantReportDto.setTid((String) obj[4]);
            merchantReportDto.setTrxPertama((Timestamp) obj[5]);
            merchantReportDto.setTransAmt((BigDecimal) obj[6]);
            merchantReportDto.setEarn((Double) obj[7]);
            merchantReportDto.setDescription((String) obj[8]);
            merchantDtos.add(merchantReportDto);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("contents", merchantDtos);
        map.put("count", (long) merchantDtos.size());
        return map;
    }

    @Override
    public Map<String, Object> getMerchantDetail() {
        List<MerchantDto> merchantDtos = new ArrayList<>();
        List<Object[]> qr = merchantRepo.getMerchantDetail();

        for (Object[] obj: qr) {
            MerchantDto merchantDto = new MerchantDto();
//            Merchant mdl = new Merchant();

//            mdl = (Merchant) obj[0];
//            merchantDto = mapperFacade.map(mdl, MerchantDto.class);
            merchantDto.setMerchantName((String) obj[0]);
            merchantDto.setMerchantCategory((String) obj[1]);

            merchantDtos.add(merchantDto);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("contents", merchantDtos);
        map.put("count", (long) merchantDtos.size());
        return map;
    }
}
