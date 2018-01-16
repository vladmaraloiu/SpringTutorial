package org.homework1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MainApp {

    @Autowired
    private Message message;

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        BusinessService businessService = context.getBean(BusinessService.class);

        for (int i=0; i<Integer.parseInt(args[0]); i++){
            businessService.process(context.getBean(Message.class));
        }
    }
}
