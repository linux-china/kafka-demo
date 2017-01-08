Kafka Demo
==========
Demo project to interact with Kafka

### Development with local Kafka

```
$ jenv install kafka 0.10.1.1
$ jenv cd kafka
$ bin/zookeeper-server-start.sh config/zookeeper.properties &
$ bin/kafka-server-start.sh config/server.properties &
$ bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic testTopic
```

### Development with Docker
Please read following instructions before coding.

```bash
  $ docker-compose up -d
  $ terraform apply
  $ open http://localhost:900
```
please click "Add Cluster" in Yahoo Kafka Manager with following settings:
```
Cluster Zookeeper Hosts = kafka:2181
Kafka Version = 0.9.0.1
```
**Attention:** ZooKeeper中保存Kafka broker的地址是容器名称，如下 /brokers/ids/0 的内容如下：

```
{"jmx_port":-1,"timestamp":"1483884382705","endpoints":["PLAINTEXT://81915309fbe1:9092"],"host":"81915309fbe1","version":2,"port":9092}
```
所以需要将图示中container id对应的ip添加到/etc/hosts才能进行测试。

### Features

* docker-compose
* Spring Cloud Stream
* Spring Boot 1.5 Kafka support

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

### References

* kafka Homepage:  http://kafka.apache.org/
* Spring Kafka: http://docs.spring.io/spring-kafka/docs/1.1.2.RELEASE/reference/html/
* Terraform: https://www.terraform.io/
* Kafka Manager: https://github.com/yahoo/kafka-manager