package com.swipepay.core.controller;

import com.swipepay.core.response.RestResponse;
import com.swipepay.core.service.BankSvc;
import com.swipepay.core.service.DeviceSvc;
import com.swipepay.core.util.CommonConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/device")
public class DeviceCtl {

    @Autowired
    DeviceSvc deviceSvc;

    @GetMapping("/all")
    public RestResponse getAll(){
        RestResponse restResponse = new RestResponse();
        restResponse.setStatus(CommonConstants.OK_REST_STATUS);
        restResponse.setContents(deviceSvc.getAll());
        return restResponse;
    }
}
