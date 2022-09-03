package org.example.consumer.service;

import lombok.extern.slf4j.Slf4j;
import org.example.provider.event.CustomerEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EmailService implements ApplicationListener<CustomerEvent> {

    @Override
    public void onApplicationEvent(CustomerEvent event) {
        log.info("第一种消费方式:{}", event.getUserName());
    }
}
