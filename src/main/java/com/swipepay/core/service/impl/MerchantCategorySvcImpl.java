package com.swipepay.core.service.impl;

import com.swipepay.core.dto.MerchantCategoryDto;
import com.swipepay.core.dto.MerchantMidDto;
import com.swipepay.core.repository.MerchantCategoryRepo;
import com.swipepay.core.repository.MerchantMidRepo;
import com.swipepay.core.service.MerchantCategorySvc;
import com.swipepay.core.service.MerchantMidSvc;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class MerchantCategorySvcImpl implements MerchantCategorySvc {

    @Autowired
    MerchantCategoryRepo merchantCategoryRepo;

    @Autowired
    MapperFacade mapperFacade;

    @Override
    public List<MerchantCategoryDto> getAll() {
        List<MerchantCategoryDto> merchantMidDtos = new ArrayList<>();
        List<Object> merchant = merchantCategoryRepo.getAll();

        merchantMidDtos = mapperFacade.mapAsList(merchant, MerchantCategoryDto.class);
        return merchantMidDtos;
    }
}
