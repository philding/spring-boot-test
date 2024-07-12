package com.phil.boot.task;

import com.phil.boot.service.CouponService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CouponTask {

    private CouponService couponService;


    public void doSomeThing() {
        couponService.getCoupon();
    }
}
