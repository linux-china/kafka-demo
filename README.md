Kafka Demo
==========
Demo project to interact with Kafka

### Development
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

* http://kafka.apache.org/
* https://www.terraform.io/
* https://github.com/yahoo/kafka-manager