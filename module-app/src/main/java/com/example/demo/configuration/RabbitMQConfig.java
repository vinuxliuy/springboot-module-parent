package com.example.demo.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述：RabbitMQ配置类：设置一个默认队列和 一个手动队列
 * 创建人：liuyong@dianxiaohuo.net
 * 创建时间： 2019-03-01:9:32
 */
@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue defaultQueue(){
        //第一个queue的名字，第二个参数是设置消息是否需要持久化处理
        return new Queue("DEFAULT_NAME",true);
    }

    @Bean
    public Queue manualQueue(){
        //第一个queue的名字，第二个参数是设置消息是否需要持久化处理
        return new Queue("MANUAL_NAME",true);
    }

}
