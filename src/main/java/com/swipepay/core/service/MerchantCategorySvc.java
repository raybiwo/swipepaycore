package com.swipepay.core.service;

import com.swipepay.core.dto.MerchantCategoryDto;
import com.swipepay.core.dto.MerchantMidDto;

import java.util.List;

public interface MerchantCategorySvc {
    public List<MerchantCategoryDto> getAll();
}
