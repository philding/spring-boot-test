package com.phil.boot.service.impl;

import com.phil.boot.service.CouponService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class CouponServiceImpl implements CouponService {


    @Override
    public String getCoupon() {
        log.info("DQF");
        return "coupon1234";
    }

}
