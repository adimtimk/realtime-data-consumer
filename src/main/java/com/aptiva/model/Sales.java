package com.aptiva.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Sales {
//AgentID, OfficeID, CarID, CustomerID, Amount (USD)
	private String agentId;
	private String officeId;
	private String carID;
	private String customerId;
	private Date salesDateTxn;
	private Double salesAmount;
	
}
