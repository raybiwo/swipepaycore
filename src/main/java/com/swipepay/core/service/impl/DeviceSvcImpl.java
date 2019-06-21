package com.swipepay.core.service.impl;

import com.swipepay.core.dto.BankDto;
import com.swipepay.core.dto.DeviceDto;
import com.swipepay.core.repository.BankRepo;
import com.swipepay.core.repository.DeviceRepo;
import com.swipepay.core.service.BankSvc;
import com.swipepay.core.service.DeviceSvc;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class DeviceSvcImpl implements DeviceSvc {
    @Autowired
    DeviceRepo deviceRepo;

    @Autowired
    MapperFacade mapperFacade;

    @Override
    public List<DeviceDto> getAll() {
        List<DeviceDto> deviceDtos = new ArrayList<>();
        List<Object> devices = deviceRepo.getAll();

        deviceDtos = mapperFacade.mapAsList(devices, DeviceDto.class);
        return deviceDtos;
    }
}
