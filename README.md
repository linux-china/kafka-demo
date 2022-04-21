Kafka Demo
==========
Demo project to interact with Kafka

### Development with Docker

Please read following instructions before coding.

```bash
  $ docker-compose up -d
  $ terraform apply
  $ open http://localhost:9000
```

please click "Add Cluster" in Yahoo Kafka Manager with following settings:

```
Cluster Zookeeper Hosts = zookeeper:2181
Kafka Version = 0.9.0.1
```

### Features

* docker-compose
* Spring Cloud Stream
* Spring Boot 2.1.9 Kafka support
* Kafka Streams
* justfile to send messages from command line

### Unit Test

Kafka JUnit: https://github.com/salesforce/kafka-junit/tree/master/kafka-junit5

### Kafka Terraform Provider

* please execute following to build binary:

```
 $ go get github.com/packetloop/terraform-provider-kafka
```

* edit ".terraformrc" file in your home and add following code:

```hcl
providers {
    kafka = "/Users/your_name/gopath/bin/terraform-provider-kafka"
}
```

### Confluent Platform

It's very easy for local development with lots of tools.  https://www.confluent.io/

### Attention

* please add following code to get you rid of the ZK issue with brokers connection.

```
spring.cloud.stream.kafka.binder.autoCreateTopics=false
```

### Articles and Books

* Kafka: The Definitive Guide, 2nd Edition: https://learning.oreilly.com/library/view/kafka-the-definitive/9781492043072/
* Custom Serializers in Apache Kafka: https://www.baeldung.com/kafka-custom-serializer

### References

* kafka Homepage:  http://kafka.apache.org/
* Redpanda: a Kafka compatible, ZooKeeper-free, JVM-free product https://redpanda.com/
* AKHQ: Kafka GUI for Apache Kafka to manage topics, topics data, consumers group, schema registry - https://github.com/tchiotludo/akhq
* Spring Kafka: https://docs.spring.io/spring-kafka/docs/2.3.0.RELEASE/reference/html/
* Reactor Kafka: https://projectreactor.io/docs/kafka/release/reference/
* Guide to Setting Up Apache Kafka Using Docker: https://www.baeldung.com/ops/kafka-docker-setup
* kcctl: A modern and intuitive command line client for Kafka Connect https://github.com/kcctl/kcctl
* Terraform: https://www.terraform.io/
* Kafka Manager: https://github.com/yahoo/kafka-manager
* Kafka Summit San Francisco 2019: https://www.confluent.io/resources/kafka-summit-san-francisco-2019/
* kafkacat: Generic non-JVM producer and consumer for Apache Kafka >=0.8, think of it as a netcat for Kafka https://github.com/edenhill/kafkacat
* bitnami/kafka: https://hub.docker.com/r/bitnami/kafka
* kcat: Generic command line non-JVM Apache Kafka producer and consumer https://github.com/edenhill/kcat
* ksqlDB: The database purpose-built for stream processing applications https://ksqldb.io/
* Kafka: The Definitive Guide, 2nd Edition - https://learning.oreilly.com/library/view/kafka-the-definitive/9781492043072/
* Deep dive into Apache Kafka storage internals: segments, rolling and retention https://strimzi.io/blog/2021/12/17/kafka-segment-retention/
* A developer's guide to using Kafka with Java, Part 1: https://developers.redhat.com/articles/2022/04/05/developers-guide-using-kafka-java-part-1
