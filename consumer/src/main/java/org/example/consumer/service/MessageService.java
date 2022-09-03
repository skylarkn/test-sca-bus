package org.example.consumer.service;

import lombok.extern.slf4j.Slf4j;
import org.example.provider.event.CustomerEvent;
import org.springframework.cloud.bus.event.SentApplicationEvent;
import org.springframework.cloud.bus.event.UnknownRemoteApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageService {

    @EventListener
    public void sendMessage(CustomerEvent event) {
        log.info("第二种消费方式:{}", event.getUserName());
    }
}
