package org.mvnsearch.cloud;

import com.salesforce.kafka.test.KafkaTestUtils;
import com.salesforce.kafka.test.junit5.SharedKafkaTestResource;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

public class KafkaUnitIntegrationTest {

    @RegisterExtension
    public static final SharedKafkaTestResource sharedKafkaTestResource = new SharedKafkaTestResource()
            .withBrokerProperty("auto.create.topics.enable", "true")
            .withBrokerProperty("message.max.bytes", "512000");

    @Test
    public void junitRuleShouldHaveStartedKafka() throws Exception {
        String testTopic = "TestTopic";
        KafkaTestUtils kafkaTestUtils = sharedKafkaTestResource.getKafkaTestUtils();
        kafkaTestUtils.createTopic(testTopic, 1, (short) 1);
        //send message
        ProducerRecord<String, String> keyedMessage = new ProducerRecord<>(testTopic, "key", "Jakie");
        KafkaProducer<String, String> kafkaProducer = kafkaTestUtils.getKafkaProducer(StringSerializer.class, StringSerializer.class);
        kafkaProducer.send(keyedMessage);
        kafkaTestUtils.consumeAllRecordsFromTopic(testTopic, StringDeserializer.class, StringDeserializer.class)
                .forEach(record -> System.out.println(record.value()));
    }
}