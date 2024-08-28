//package com.aptiva.kstreams;
//
//import java.util.function.Function;
//
//import org.apache.kafka.common.serialization.Serdes;
//import org.apache.kafka.streams.kstream.Grouped;
//import org.apache.kafka.streams.kstream.KStream;
//import org.springframework.stereotype.Component;
//
//import com.aptiva.model.GPSData;
//import com.aptiva.model.GPSDataCount;
//import com.aptiva.model.JsonSerde;
//
//import lombok.extern.log4j.Log4j2;
//
//@Component
//@Log4j2
//public class CustomerProcessor implements Function<KStream<Void, GPSData>, KStream<String, GPSDataCount>> {
//
//	@Override
//	public KStream<String, GPSDataCount> apply(KStream<Void, GPSData> gpsstream) {
//		// TODO Auto-generated method stub
//		return gpsstream
//			.peek((u,g)-> log.info("Processing the customer gps data {}",g))
//			.groupBy((u,v)-> v.getCarMovementStatus(),Grouped.with(Serdes.String(), new JsonSerde<>(GPSData.class)))
//			.count()
//			.mapValues(GPSDataCount::new)
//			.toStream()
//			.peek((k,count)->log.info("Processing the customer gps data {}",count))
//			;
//		
//	}
//	
//
//}
