package org.homework1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {

    @Autowired
    MessageRepository repo;

    public void process(Message message) {
        repo.store(message);
        //message.printID();
    }
}
