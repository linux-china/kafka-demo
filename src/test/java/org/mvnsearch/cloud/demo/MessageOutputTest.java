package org.mvnsearch.cloud.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

/**
 * message output test
 *
 * @author linux_china
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class MessageOutputTest {
    @Autowired
    private StreamBridge streamBridge;

    @Test
    public void testSend() {
        Message<String> message = MessageBuilder.withPayload("Good Afternoon")
                .setHeader(KafkaHeaders.KEY, "1")
                .build();
        streamBridge.send("output", message);
    }
}
