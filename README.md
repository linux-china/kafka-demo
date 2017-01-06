Kafka Demo
==========
Demo project to interact with Kafka


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