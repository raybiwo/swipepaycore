package com.swipepay.core.service;

import com.swipepay.core.dto.MerchantDto;

import java.util.List;
import java.util.Map;

public interface MerchantSvc {
    public Map<String, Object> getMerchantReport();

    public Map<String, Object> getMerchantDetail();
}
