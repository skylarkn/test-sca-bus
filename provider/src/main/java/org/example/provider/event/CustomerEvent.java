package org.example.provider.event;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.example.provider.event.base.AbstractAresEvent;
import org.springframework.cloud.bus.event.Destination;
import org.springframework.cloud.bus.event.RemoteApplicationEvent;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonIgnoreProperties({"source"})
public class CustomerEvent extends AbstractAresEvent<String> {

    private CustomerEvent() {
    }

    public CustomerEvent(Object source, String originService,
                         Destination destination, String data) {
        super(source, originService, destination, data);
    }

    public String getUserName() {
        return getData();
    }
}
