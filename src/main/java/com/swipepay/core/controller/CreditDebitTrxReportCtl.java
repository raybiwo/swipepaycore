package com.swipepay.core.controller;

import com.swipepay.core.response.RestResponse;
import com.swipepay.core.service.BankSvc;
import com.swipepay.core.service.CreditDebitTrxReportSvc;
import com.swipepay.core.util.CommonConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/creditdebitreport")
public class CreditDebitTrxReportCtl {

    @Autowired
    CreditDebitTrxReportSvc creditDebitTrxReportSvc;

    @GetMapping("/all")
    public RestResponse getAll(){
        RestResponse restResponse = new RestResponse();
        restResponse.setStatus(CommonConstants.OK_REST_STATUS);
        restResponse.setContents(creditDebitTrxReportSvc.getAll());
        return restResponse;
    }
}
