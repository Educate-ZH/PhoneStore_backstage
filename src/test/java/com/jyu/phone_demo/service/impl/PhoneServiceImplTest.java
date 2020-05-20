package com.jyu.phone_demo.service.impl;

import com.jyu.phone_demo.service.PhoneService;
import com.jyu.phone_demo.vo.DataVO;
import com.jyu.phone_demo.vo.PhoneInfoVO;
import com.jyu.phone_demo.vo.SpecsPackageVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PhoneServiceImplTest {
    @Autowired
    private PhoneService phoneService;
    @Test
    void findDataVO(){
        DataVO dataVO=phoneService.findDataVO();
        int id=0;
    }

    @Test
    void findPhoneInfoVOByCategoryType() {
        List<PhoneInfoVO> list=phoneService.findPhoneInfoVOByCategoryType(2);
        int id=0;
    }

    @Test
    void findSpecsByPhoneId() {
        SpecsPackageVO specsPackageVO=phoneService.findSpecsByPhoneId(1);
        int id=1;
    }

    @Test
    void subStock() {
        phoneService.subStock(1,14);
    }
}