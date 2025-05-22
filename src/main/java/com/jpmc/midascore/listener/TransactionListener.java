package com.jpmc.midascore.listener;


import com.jpmc.midascore.config.KafkaProperties;
import com.jpmc.midascore.dto.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionListener {
    private static final Logger log = LoggerFactory.getLogger(TransactionListener.class);
    private final KafkaProperties props;

    @Autowired
    public TransactionListener(KafkaProperties props) {
        this.props = props;
    }

    @KafkaListener(
            topics = "#{kafkaProperties.topic}",
            containerFactory = "kafkaListenerContainerFactory"
    )
    public void onMessage(Transaction txn) {
        log.info("Received txn #{} → amount = {}", txn.getId(), txn.getAmount());
    }
}

