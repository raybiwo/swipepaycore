package com.swipepay.core.controller;

import com.swipepay.core.response.RestResponse;
import com.swipepay.core.service.MerchantMidSvc;
import com.swipepay.core.service.MerchantSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/merchantmid")
public class MerchantMidCtl {
    @Autowired
    MerchantMidSvc merchantMidSvc;

    @GetMapping("/all")
    public RestResponse merchantReport(){
        RestResponse restResponse = new RestResponse();
        restResponse.setContents(merchantMidSvc.getAll());

        return restResponse;
    }
}
