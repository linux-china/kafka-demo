provider "kafka" {
  bootstrap_servers = ["localhost:9092"]
}

resource "kafka_topic" "secondTopic" {
  name = "secondTopic"
  replication_factor = 1
  partitions = 200

  config = {
    "segment.ms" = "4000"
    "cleanup.policy" = "delete"
    "retention.ms" = "86400000"
  }
}