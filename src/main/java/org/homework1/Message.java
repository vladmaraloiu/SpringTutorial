package org.homework1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Message {

    @Autowired
    private MessageId messageId;

    public MessageId getID() {
        return messageId;
    }
}
