package org.example.consumer.config;


import org.example.provider.event.CustomerEvent;
import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@RemoteApplicationEventScan(basePackageClasses = CustomerEvent.class)
public class BusConfiguration {
}
