package org.homework1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("application.properties")
public class ApplicationProperties {
    @Value("${repositoryType}")
    private ApplicationType type;

    public ApplicationType getType() {
        return type;
    }
}
