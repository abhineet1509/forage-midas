package com.jpmc.midascore.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "midas.kafka")
public class KafkaProperties {
    private String topic;
    public String getTopic() { return topic; }
    public void setTopic(String topic) { this.topic = topic; }
}