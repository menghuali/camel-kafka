package org.mylearning.camel.kafka;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class KafkaRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("kafka:inbound?brokers=localhost:9092&groupId=myGroup&autoOffsetReset=earliest&consumersCount=1")
                .to("log:mylogger?level=INFO&showBody=true");
    }

}
