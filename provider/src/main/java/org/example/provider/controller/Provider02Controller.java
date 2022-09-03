package org.example.provider.controller;

import org.example.provider.event.CustomerEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.bus.ServiceMatcher;
import org.springframework.cloud.bus.event.PathDestinationFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author guzb
 * @since 2022-08-05
 */
@RestController
@RequestMapping("/business")
public class Provider02Controller {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    private ServiceMatcher serviceMatcher;

    @Autowired
    private PathDestinationFactory pathDestinationFactory;


    @PostMapping()
    public void publishEvent() {
        // 发布事件
        applicationEventPublisher.publishEvent(new CustomerEvent(this, serviceMatcher.getBusId(), pathDestinationFactory.getDestination("**"), "我是一条测试信息"));
    }
}
