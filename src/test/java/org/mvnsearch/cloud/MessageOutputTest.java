package org.mvnsearch.cloud;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * message output test
 *
 * @author linux_china
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class MessageOutputTest {
    @Autowired
    private Source source;

    @Test
    public void testSend() {
        Message<String> message = MessageBuilder.withPayload("Good Afternoon").setHeader("accoutId","1").build();
        source.output().send(message);
    }
}
