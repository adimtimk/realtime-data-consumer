package com.aptiva.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.aptiva.model.Customer;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class CustomerListerner {
	@Value("${customer.topic}")
    private String customer_topic;
	@KafkaListener(groupId = "cust-grp-1",topics ="#{'${customer.topic}'}" )
	public void consume(Customer cust) {
		 log.info("Customer consume the events {} ", cust.toString());
		}
}
