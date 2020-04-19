package com.sphnews.springcloud.controller;

import com.sphnews.springcloud.entities.CommonResult;
import com.sphnews.springcloud.entities.Payment;
import com.sphnews.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author LuoYi
 * @create 2020-04-18 11:53
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*****insert record : " + result + ",server port: "+serverPort);
        if (result >0){
            return new CommonResult(200,"insert record success"+ ",server port: "+serverPort,result);
        }else {
            return new CommonResult(444,"insert record error"+ ",server port: "+serverPort,null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("***查询结果***** ：" + payment+ ",server port: "+serverPort);
        if (payment != null) {
            return new CommonResult(200, "查询数据成功 "+ ",server port: "+serverPort, payment);
        } else {
            return new CommonResult(444, "没有对应记录"+id+ ",server port: "+serverPort, null);
        }
    }
}
