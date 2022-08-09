# send message from console input
send_message:
   docker-compose exec kafka /opt/kafka/bin/kafka-console-producer.sh --broker-list localhost:9092 --topic testTopic

sending:
   echo "hello there" | kafkacat -b 127.0.0.1 -t testTopic -H "kafka_messageKey=1"

topic-msg-count:
    bin/kafka-run-class.sh kafka.tools.GetOffsetShell   --broker-list localhost:9092 --topic baeldung