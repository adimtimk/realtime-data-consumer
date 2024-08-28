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
public class Customer {
//CustomerID, Mobile No, Name, Gender, Age, Nationality, PassportNo, ID No, Home Address,Lease Start Date, Lease Period
private String customerId;
private String mobileNum;
private String name;
private String gender;
private int age;
private String nationality;
private String passportNum;
private String idNum;
private Date leaseStartDate;
private Date leaseEndDate;
private int leasePeriod;
private String city;
private String code;
private String area;



}
