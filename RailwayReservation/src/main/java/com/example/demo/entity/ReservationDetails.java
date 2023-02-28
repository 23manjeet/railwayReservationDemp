package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "reservation")
public class ReservationDetails {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	int id;
	
	String name;
	Long age;
	String gender;
	String trainName;
	Long trainNumber;
	String classType;
	String journeyFrom;
	String destination;
	@Id
	String pnr;
	
}
