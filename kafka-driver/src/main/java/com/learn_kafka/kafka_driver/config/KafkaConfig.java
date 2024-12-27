package com.learn_kafka.kafka_driver.config;

import com.learn_kafka.kafka_driver.Constant.AppConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.learn_kafka.kafka_driver.Constant.AppConstant.CAB_LOCATION;

@Configuration
public class KafkaConfig {



    @Bean
    public NewTopic topic(){
        return TopicBuilder
                .name(CAB_LOCATION)
                .build();
    }

}
