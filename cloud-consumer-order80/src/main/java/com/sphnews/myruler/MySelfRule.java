package com.sphnews.myruler;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author LuoYi
 * @create 2020-04-19 09:41
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RoundRobinRule();
    }
}
