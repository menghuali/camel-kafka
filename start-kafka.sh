confluent local destroy
confluent local services kafka start
kafka-topics --bootstrap-server localhost:9092 --create --topic inbound --partitions 1 --replication-factor 1