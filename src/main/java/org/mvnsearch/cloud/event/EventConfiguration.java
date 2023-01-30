package org.mvnsearch.cloud.event;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class EventConfiguration {
    @Bean
    public Consumer<String> sink() {
        return payload -> System.out.println("Payload:" + payload);
    }
}
