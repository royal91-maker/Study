package com.sphnews.springcloud.service;

import com.sphnews.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author LuoYi
 * @create 2020-04-18 11:50
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
