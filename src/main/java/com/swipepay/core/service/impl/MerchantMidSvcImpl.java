package com.swipepay.core.service.impl;

import com.swipepay.core.dto.MerchantMidDto;
import com.swipepay.core.repository.MerchantMidRepo;
import com.swipepay.core.service.MerchantMidSvc;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class MerchantMidSvcImpl implements MerchantMidSvc {

    @Autowired
    MerchantMidRepo merchantMidRepo;

    @Autowired
    MapperFacade mapperFacade;

    @Override
    public List<MerchantMidDto> getAll() {
        List<MerchantMidDto> merchantMidDtos = new ArrayList<>();
        List<Object> merchant = merchantMidRepo.getAll();

        merchantMidDtos = mapperFacade.mapAsList(merchant, MerchantMidDto.class);
        return merchantMidDtos;
    }
}
