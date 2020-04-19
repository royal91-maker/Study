package com.sphnews.springcloud.service.impl;

import com.sphnews.springcloud.dao.PaymentDao;
import com.sphnews.springcloud.entities.Payment;
import com.sphnews.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author LuoYi
 * @create 2020-04-18 11:50
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
