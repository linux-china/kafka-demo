Kafka Demo
==========
Demo project to interact with Kafka

![Kafka Internal](kafka-internal.png)

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
* Kafka Cheatsheet: https://www.javacodegeeks.com/apache-kafka-cheatsheet.html
* Kafka: An Overview - https://medium.com/@vinciabhinav7/kafka-an-overview-859c51081a30
* Apache Kafka Essentials Cheatsheet: https://www.javacodegeeks.com/apache-kafka-essentials-cheatsheet
* Kafka vs Redpanda Performance - Do the claims add up? https://jack-vanlightly.com/blog/2023/5/15/kafka-vs-redpanda-performance-do-the-claims-add-up
* Apache Kafka: A Quickstart Guide for Developers - https://dev.to/ciscoemerge/apache-kafka-a-quickstart-guide-for-developers-80p?s=09
* Redpanda: a Kafka compatible, ZooKeeper-free, JVM-free product https://redpanda.com/
* Spring Tips: Spring Boot & Apache Kafka - https://spring.io/blog/2022/10/10/spring-tips-spring-boot-apache-kafka
* AKHQ: Kafka GUI for Apache Kafka to manage topics, topics data, consumers group, schema registry - https://github.com/tchiotludo/akhq
* kafka-ui: UI for Apache Kafka - https://github.com/provectus/kafka-ui
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
* Get the Number of Messages in an Apache Kafka Topic: https://www.baeldung.com/java-kafka-count-topic-messages
* 3rd party command line tools for Apache Kafka: https://forum.confluent.io/t/3rd-party-command-line-tools-for-apache-kafka/919/8
* Building Rust microservices with Apache Kafka: https://blog.logrocket.com/building-rust-microservices-apache-kafka/
* Guide to Spring Cloud Stream with Kafka, Apache Avro and Confluent Schema Registry: https://www.baeldung.com/spring-cloud-stream-kafka-avro-confluent
* Documenting Spring Event-Driven API Using AsyncAPI and Springwolf: https://www.baeldung.com/java-spring-doc-asyncapi-springwolf
* Kafka StreamCraft: A Dive Into Liquid Data: https://www.felpfe.com/2023/09/13/kafka-streamcraft-a-dive-into-liquid-data/
* Functional Kafka with Spring Cloud:
   - Part 1:  https://dev.to/anthonyikeda/functional-kafka-with-spring-cloud-part-1-2h7h
   - Part 2:  https://dev.to/anthonyikeda/functional-kafka-with-spring-cloud-part-2-20g9
   - Part 3:  https://dev.to/anthonyikeda/functional-kafka-with-spring-cloud-part-3-543j

