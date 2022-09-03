package org.example.provider.event.base;

import lombok.Data;
import org.springframework.cloud.bus.event.Destination;
import org.springframework.cloud.bus.event.RemoteApplicationEvent;

@Data
public abstract class AbstractAresEvent<T> extends RemoteApplicationEvent {
    private T data;

    public AbstractAresEvent() {
        // for serialization
    }

    public AbstractAresEvent(Object source, String originService, Destination destination, T data) {
        super(source, originService, destination);
        this.data = data;
    }
}
