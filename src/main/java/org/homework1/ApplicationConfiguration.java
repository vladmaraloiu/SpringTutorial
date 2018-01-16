package org.homework1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ApplicationConfiguration {

    @Bean
    public MessageRepository messageRepository(ApplicationProperties properties){
        switch (properties.getType()){
            case IN_MEMORY:
                return new InMemoryStoreRepository();
            case FILE:
                return new FileStoreRepository();
            default:
                throw new UnsupportedOperationException("Store type not supporte" + properties.getType());
        }
    }
}
