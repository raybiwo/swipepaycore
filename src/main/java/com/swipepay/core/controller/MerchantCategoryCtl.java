package com.swipepay.core.controller;

import com.swipepay.core.response.RestResponse;
import com.swipepay.core.service.MerchantCategorySvc;
import com.swipepay.core.service.MerchantMidSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/merchantCategory")
public class MerchantCategoryCtl {
    @Autowired
    MerchantCategorySvc merchantCategorySvc;

    @GetMapping("/all")
    public RestResponse merchantReport(){
        RestResponse restResponse = new RestResponse();
        restResponse.setContents(merchantCategorySvc.getAll());

        return restResponse;
    }
}
