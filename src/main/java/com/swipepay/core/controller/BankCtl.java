package com.swipepay.core.controller;

import com.swipepay.core.service.BankSvc;
import com.swipepay.core.response.RestResponse;
import com.swipepay.core.util.CommonConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bank")
public class BankCtl {

    @Autowired
    BankSvc bankSvc;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public RestResponse getAll(){
        RestResponse restResponse = new RestResponse();
        restResponse.setStatus(CommonConstants.OK_REST_STATUS);
        restResponse.setContents(bankSvc.getAll());
        return restResponse;
    }

    @GetMapping("/getOne")
    public RestResponse getOne(){
        RestResponse restResponse = new RestResponse();
        restResponse.setStatus(CommonConstants.OK_REST_STATUS);
        restResponse.setContents(bankSvc.getOne());
        return restResponse;
    }
}
