package org.homework1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope("prototype")
public class MessageId {

    private String id;

    public MessageId(){
        id = UUID.randomUUID().toString();
    }

    public String printID() {
        return id;
    }
}
