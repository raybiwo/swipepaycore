package com.swipepay.core.controller;

import com.swipepay.core.response.RestResponse;
import com.swipepay.core.service.BankSvc;
import com.swipepay.core.service.UsersSvc;
import com.swipepay.core.util.CommonConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersCtl {

    @Autowired
    UsersSvc usersSvc;

//    @GetMapping("/getPassword/{username}")
//    public RestResponse getPassword(@PathVariable("username") String username){
//        RestResponse restResponse = new RestResponse();
//        restResponse.setStatus(CommonConstants.OK_REST_STATUS);
//        restResponse.setContents(usersSvc.getPassword(username));
//        return restResponse;
//    }
}
