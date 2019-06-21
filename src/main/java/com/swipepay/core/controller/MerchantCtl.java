package com.swipepay.core.controller;

import com.swipepay.core.response.RestResponse;
import com.swipepay.core.service.MerchantSvc;
import com.swipepay.core.util.CommonConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/merchant")
public class MerchantCtl {
    @Autowired
    MerchantSvc merchantSvc;

    @GetMapping("/merchantreport")
    public RestResponse merchantReport(){
        RestResponse restResponse = new RestResponse();
        restResponse.setStatus(CommonConstants.OK_REST_STATUS);
        Map<String, Object> map = merchantSvc.getMerchantReport();
        restResponse.setTotalRecords((long) map.get("count"));
        restResponse.setContents(map.get("contents"));

        return restResponse;
    }

    @GetMapping("/merchantdetail")
    public RestResponse getMerchantDetail(){
        RestResponse restResponse = new RestResponse();
        restResponse.setStatus(CommonConstants.OK_REST_STATUS);
        Map<String, Object> map = merchantSvc.getMerchantDetail();
        restResponse.setTotalRecords((long) map.get("count"));
        restResponse.setContents(map.get("contents"));
        return restResponse;
    }
}
